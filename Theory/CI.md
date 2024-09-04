# CI

## What is Continuous Integration and how is it implemented?

Continuous integration is a strategy used by many software developers to catch bugs and errors faster.
The main concept is, that by committing smaller but more frequent changes, that it is easier to check for possible problems than with a lot of changes at once.
This integration method also takes use of the version control, which helps organize and structure the history of a project. 

The integration process itself can be automated or done manually.
For example, Jenkins and GitHub provide tools to write automated pipelines to check the new submitted code for errors. 
These pipelines are also able to build and pack the project, so a consistent output is more likely. 

These strategies help keep everything consistent and improve collaboration and the software quality.

## What are the advantages and disadvantages of CI?

Continuous Integration (CI) makes software development smoother by automatically merging code changes from different developers into a shared space, which helps spot and fix errors early.
It provides real-time feedback, keeps everyone on the same page, and reduces the stress of last-minute integration issues.
CI also keeps the codebase stable, making releases faster and more reliable.
It’s like having a safety net for your code, ensuring that changes are constantly tested and integrated, leading to better quality software.

## What is Continuous Testing and how is it implemented?


## What is a branching strategy and what are the known ones?


## How can commits and branches be linked to user stories?

Commits and branches can be easily linked to user stories through ticket numbers, which act as unique IDs. Tools like Jira and GitLab allow cross-platform linking; for instance, when a ticket is created in Jira, the related branch in GitLab is automatically marked. Even if teams use different ticket systems, adding a short prefix to the ticket number keeps everything unique. Depending on the integration method used, there are different ways to link tickets to branches. 

In our project, we use ticket numbers to identify the correlation between a branch and a ticket. We normally don't use the link feature on GitHub, because it closes the tickets with a closed merge request, which isn't working for our collaboration. 

## What merge strategies are there and how are they implemented?



## What is semantic versioning and how is it implemented?



## What is the difference between monorepo and multirepo (especially in the context of microservices)?



## What is an artifact repository and what role does it play in your process?


## Sources

- [Devcycle](https://devcycle.com/blog/pros-and-cons-explored-continuous-integration-deployment) was used for information.
- [Ionos](https://www.ionos.com/digitalguide/websites/web-development/continuous-integration/) was used for information.

