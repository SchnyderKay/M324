# Documentation

## PROJECT DEFINITION

Our application gives the user the opportunity to use a dropdown menu and choose an ingredient (ex. Gin, Vodka,Cola, Tonic). 
Based on the decision the application checks a database filled with cocktails and provides the user with all the possible cocktails with the chosen ingredient (ex. Gin Tonic, Vodka sour, Cuba Libre).
The Cocktails will be editable via CRUD (Create, Read, Update, Delete) endpoints.

**Extra**

In a further step the user is able to select a cocktail and sending an e-mail with all the necessary ingredients to their personal mailbox.

Additionally, the user is able to ask for a random cocktail.

## Rules

**Branching Rules**

Never push directly to the main branch.
Always create a new feature branch from the main and create a pull-request to the main branch. 
The branch name starts with the ticket number-name and a short description of the task.
Example: 1-documentation-add-definition


To contribute your work, create a new branch according to the branch naming rules. 
This branch can be used as a topic or feature branch. 
To merge the branch, create a pull-request and ask for a code review. 
Additionally, for the optional learn journal, please create a personal branch, which will be merged at the end of the project.

**Commit Rules**

There is no commit amount limit, but everyone should consider the readability of a branch.
Every commit has a commit message with a short description about the changes in the commit. 
Force-push is not allowed

**Merge Criteria**

All tests must pass before approving a pull-request.
There are no debug logs allowed in a pull-request.
Every pull-request must be reviewed and approved by at least one other collaborators.

**Meetings** 

The weekly will be every Tuesday at 8:30.
At the meeting the team checks and updates the Kanban board and discusses the tasks in progress.

**Enviroment**

We will write our Frontend in Typescript React and our Backend in Java.
Every collaborator can use the IDE they prefer.

## Database

**Setup**

To setup the Docker container use the command given below
```
docker run --name local-postgres -e POSTGRES_PASSWORD=drinks -p 5432:5432 -d postgres
```

When the container is running you can start DBeaver and follow the instructions:

**Step 1**

🔴 Start by clicking the icon shown in the image.

![image info](./Images/1.png)

**Step 2**

🔴 Insert "drinks" in the password area.
🟢 coninue by clicking finish.

![image info](./Images/2.png)

**Step 3**

🟢 Aftrer creating a connection, click on SQL in the navbar.

![image info](./Images/1.png)

**Step 4**

Insert the SQL statement given 

[SQL file](./drinks_db.sql) 

🔴 Afterwards click the run script to create a table with data.

![image info](./Images/4.png)

## Time

Every collaborator must fill in his own time on the time sheet.
For every work time the collaborator must fill in the task they worked on and the required time.
The time must be entered to the nearest 15 minutes.

[Time Sheet](https://tbzedu-my.sharepoint.com/:x:/r/personal/kay_schnyder_edu_tbz_ch/_layouts/15/Doc.aspx?sourcedoc=%7B4C0BDA20-4AE3-4985-A780-3F4F67B43329%7D&file=time_logger%201.xlsx&action=default&mobileredirect=true&wdOrigin=TEAMS-WEB.p2p_ns.rwc&wdExp=TEAMS-TREATMENT&wdhostclicktime=1724143689247&web=1)