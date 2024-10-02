import React, { useState } from 'react';
import axios from 'axios';
import CryptoJS from 'crypto-js';

interface GitHubIssue {
    html_url: string;
    title: string;
    body: string;
}

const secretKey = 'TheDrinkDomainIsReallyCool&Functional'; // The same secret key used for encryption

const decryptToken = (encryptedToken: string) => {
    const bytes = CryptoJS.AES.decrypt(encryptedToken, secretKey);
    return bytes.toString(CryptoJS.enc.Utf8);
};

const GitHubIssueForm = () => {
    const [title, setTitle] = useState('');
    const [body, setBody] = useState('');
    const [response, setResponse] = useState<GitHubIssue | null>(null);
    const encryptedToken = 'U2FsdGVkX19xauqjk3XwEbvwv2sRYaOeZpNMZXx476c9Dngqf9ouEKjJTqEQluNAvZUdobEw/nfEA1eYNgIYXw=='; // Place your encrypted token here

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();

        const data = {
            title: title,
            body: body,
        };

        const token = decryptToken(encryptedToken); // Decrypt the token

        try {
            const res = await axios.post<GitHubIssue>(
                'https://api.github.com/repos/SchnyderKay/M324/issues',
                data,
                {
                    headers: {
                        Authorization: `token ${token}`,
                        Accept: 'application/vnd.github.v3+json',
                    },
                }
            );
            setResponse(res.data);
            alert("Issue created successfully!");
        } catch (error) {
            console.error(error);
            alert("Failed to create issue");
        }
    };

    return (
        <div style={{ margin: '2rem' }}>
            <h1>Create GitHub Issue</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>
                        Issue Title:
                        <input
                            type="text"
                            value={title}
                            onChange={(e) => setTitle(e.target.value)}
                            required
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Issue Description:
                        <textarea
                            value={body}
                            onChange={(e) => setBody(e.target.value)}
                            required
                        ></textarea>
                    </label>
                </div>
                <button type="submit">Submit Issue</button>
            </form>

            {response && (
                <div>
                    <h2>Issue Created</h2>
                    <p>
                        Issue URL: <a href={response.html_url} target="_blank" rel="noreferrer">{response.html_url}</a>
                    </p>
                </div>
            )}
        </div>
    );
};

export default GitHubIssueForm;
