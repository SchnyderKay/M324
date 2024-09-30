# Learning Journal

## 20 August 2024

### Activities

- **Planning and Organization:**
  - Our group came together to discuss the overall plan for this module. We identified the key tasks that needed to be completed and established a timeline to ensure everything was organized.
  - We broke down the module's requirements into actionable tasks and assigned responsibilities to each group member.

- **Repository and Ticket Creation:**
  - We set up a new GitHub repository to manage our project code and documentation.
  - Tickets were created in the GitHub backlog to track the progress of each task. We used these tickets to assign specific tasks to team members, ensuring that everyone knew their responsibilities.
  - We also added labels and deadlines to the tickets to prioritize the work efficiently.

- **Assigned Tasks:**
  - I was responsible for researching and completing the theoretical task on the CALMS framework. This involved studying the concepts and preparing a summary that would be useful for the group.

### CALMS Framework Insights

- **Culture:** The foundation of DevOps, focusing on collaboration and communication between teams. A strong culture reduces silos and fosters shared responsibility.

- **Automation:** Automating repetitive tasks, such as testing and deployment, to increase efficiency and reduce human error. Automation is key to achieving consistent and reliable results.

- **Lean:** Emphasizing the importance of continuous improvement, waste reduction, and maximizing value. Lean principles guide the team to focus on delivering value quickly and effectively.

- **Measurement:** Tracking performance metrics to identify bottlenecks and areas for improvement. Measuring progress is crucial for making informed decisions and driving continuous improvement.

- **Sharing:** Promoting knowledge sharing across teams to build a strong learning culture. Sharing ensures that best practices are adopted and challenges are addressed collaboratively.

### Reflection

Initially, we felt like we were thrown into cold water, as we didn't have a clear understanding of what DevOps entailed. It was challenging to figure out the module's requirements and what needed to be done. However, as a group, we quickly found our footing. Through effective planning and communication, we were able to distribute tasks evenly and work towards our goals efficiently.

Our group dynamic improved as we collaborated on task assignments and supported each other in understanding complex topics. This teamwork allowed us to make significant progress, and we are now almost finished with the tasks due next week. The experience highlighted the importance of good planning and communication, which will be critical as we continue working on this module.

## 27 August 2024

### Activities

- **CALMS Theory Completed:**
  - I finalized the research and documentation for the CALMS framework, making sure all key concepts were thoroughly understood and articulated for the team.
  
- **Reviewed Three Ways Theory:**
  - As a group, we reviewed the Three Ways theory, which is essential in understanding DevOps principles. We discussed its implications and how it can be applied to our project.

- **Skeleton Project Setup:**
  - I assisted in setting up the skeleton of our project, laying down the basic structure and organizing the initial files and directories.
  
- **Database Setup:**
  - We set up the initial database for the project, ensuring that the necessary tables and schemas were created to support our application's functionality.

- **Backlog Tickets Filling Out:**
  - Continued to fill out and refine the backlog tickets in GitHub, adding more detailed descriptions and setting priorities for upcoming tasks.

### Reflection

This week was productive as we completed several key tasks, including finalizing the CALMS theory and setting up the project’s foundational components. Working through the Three Ways theory provided us with a deeper understanding of DevOps principles, which will be valuable as we move forward.

Our ability to collaborate effectively has improved, especially in setting up the project infrastructure and organizing our workflow through backlog tickets. This structured approach is helping us stay on track and ensuring that everyone is clear on their responsibilities. Overall, the progress we’ve made this week has been encouraging, and we are well-prepared for the next steps.

## Learning Journal Entry - 3 September 2024

### Activities

- **Create Tickets in Backlog:**
  - We identified the remaining tasks for the module and created detailed tickets in the GitHub backlog to track their progress. Each ticket was assigned to a team member to ensure that all tasks were accounted for and distributed evenly.

- **Write User Stories:**
  - We wrote comprehensive user stories for the main features of our project. This involved outlining the requirements for each CRUD operation, ensuring that all functionalities were covered from the user’s perspective. These user stories will guide our development process and ensure that we meet the user needs effectively.

- **Setting up Skeleton Project for Module:**
  - We continued to refine and expand the skeleton project, focusing on setting up the remaining structure and integrating the necessary modules. This setup will serve as the foundation for the rest of our development work and ensure that our codebase is well-organized.

### Reflection

This week has been particularly challenging due to the time pressure we’re under. With the deadline looming next week and one of our team members absent for two weeks in a row, we’ve had to pick up the slack and work extra hours at home to stay on track. 

Despite the stress, our team’s morale remains high, and we’ve managed to maintain a positive working environment. The vibe in the team is still good, which is helping us cope with the heavy workload. We’re confident that we can meet the deadline, but it’s going to be a close call. The next few days will be critical, and we’ll need to keep up the pace to ensure we deliver everything on time.


# Learning Journal Entry - 10 September 2024

## Tickets Worked On:
- Write CI-Theory
- Fix User Stories
- Write Documentation

## Theory of the Day: Continuous Integration (CI)

### What is Continuous Integration and How is it Implemented?
Continuous Integration (CI) is a software development strategy designed to detect bugs and errors early by committing smaller, more frequent changes to the codebase. The idea is that with more frequent updates, it's easier to identify and isolate issues before they grow into larger problems. 

CI heavily relies on version control, such as Git, to organize and structure the project’s history, ensuring that every change is properly tracked.

The integration process can either be automated or manual. For example, tools like Jenkins and GitHub Actions allow developers to write automated pipelines that run tests on newly submitted code to check for errors. These pipelines can also build and package the project, ensuring consistent output and minimizing the chances of introducing instability into the project.

By adopting CI, teams are able to improve software quality, keep the codebase consistent, and collaborate more effectively.

### What are the Advantages and Disadvantages of CI?
#### Advantages:
- **Early Detection of Errors:** CI allows teams to spot and fix errors early in the development process, which helps maintain a stable codebase.
- **Real-time Feedback:** Developers receive immediate feedback on their code changes, enabling quicker iterations and better collaboration.
- **Reduced Integration Risk:** CI ensures that code changes are frequently integrated, avoiding the stressful last-minute rush to merge code before a release.
- **Faster Releases:** By maintaining a stable codebase, CI allows for faster and more reliable software releases.

#### Disadvantages:
- **Requires Setup and Maintenance:** Setting up CI tools and writing automated tests can be time-consuming and may require ongoing maintenance.
- **Test Coverage Needed:** If the test suite isn't comprehensive, CI may not catch every bug or issue, which could result in a false sense of security.
  
## Reflection:
We were able to catch up on a lot of tasks because I worked overtime from home. I completed many of the tickets, which were mostly theoretical and documentation-heavy. While I find it frustrating to focus on writing instead of coding, I recognize that this is part of the process and a team effort.

Some frustration also stems from the fact that our team is stuck on the coding portion, which affects our progress. But as a team player, I know that these tasks—though not my favorite—are necessary to ensure that we stay on track. At the end of the day, I’m okay with the tasks I completed, though I didn’t learn much new beyond reinforcing the core concepts of CI.



# Learning Journal - 17 September 2024

## Tickets Worked On:
- Theory CD Task
- CI Theory Fixing
- Learning Journal

## Theory of the Day: Continuous Deployment (CD)

### What is Continuous Deployment and How is it Implemented?

**Introduction to Continuous Deployment**  
Continuous Deployment (CD) is a software development practice that automates the entire release process, allowing code changes to be automatically deployed to production environments once they pass a series of automated tests. Unlike traditional methods that require manual approval for releases, CD aims to streamline and speed up the process by eliminating manual intervention. CD is a core aspect of DevOps and significantly impacts how modern software is delivered, fostering a faster, more efficient release cycle.

In a continuous deployment workflow, every change that passes automated testing is immediately deployed to production. This method enables teams to push out new features, improvements, and bug fixes quickly while maintaining system stability and code quality.

### Key Concepts of Continuous Deployment

1. **Automated Testing**  
   Automated testing is essential to the CD process. Before any code is deployed to production, it must pass a suite of automated tests that ensure its correctness and functionality. Common types of tests include:
   - **Unit Tests**: Check individual code components for expected behavior.
   - **Integration Tests**: Verify that different parts of the application interact correctly.
   - **End-to-End Tests**: Simulate real user interactions and test the system's overall functionality.
   
   These tests help ensure that changes won’t introduce bugs or regressions in production.

2. **CI/CD Pipelines**  
   A CI/CD pipeline is a sequence of automated steps that build, test, and deploy code. For continuous deployment, this pipeline is critical as it ensures a smooth, automated transition from code integration to deployment. A typical CI/CD pipeline includes:
   - **Code Integration**: Once new code is merged into the main branch, the pipeline is triggered.
   - **Automated Build**: The system compiles the new code and prepares it for testing.
   - **Automated Testing**: The code goes through a series of automated tests.
   - **Automated Deployment**: Once the tests pass, the code is automatically deployed to production.

CD allows for faster, more reliable deployments, improving software quality and team productivity.

---

## Reflection:
Today was the first time during this module that everything went exceptionally well. We were finally able to submit tasks without needing to work from home, which felt like a huge relief. The only exception was some of the theory work, but even that didn’t require staying up late or putting in extra hours. 

It felt great to work within the normal schedule and still get everything done. Our progress today really demonstrated how much we've grown as a team. We were able to tackle both practical and theoretical tasks, and for the first time, it felt like we were really in control of the process.

Having the freedom to work solely on the theory at home also meant that when we were together, we could focus on actual coding and technical work, which I find much more engaging. The workflow seemed smoother, and we are finally approaching the point where everything is starting to fall into place. 


# Learning Journal Entry - 24 September 2024

## Tasks Worked On
- **Fixing Branching Strategy**: Refined and adjusted the branching strategy for the project to improve collaboration and efficiency in version control.
- **Documentation**: Focused on updating and writing new documentation for the module. This involved improving clarity and ensuring all procedures and workflows are properly documented.
- **Theory**: Spent some time revisiting theoretical aspects to ensure the documentation is well-grounded in both practical and theoretical knowledge.

## Reflection
This week was quite different as the deadlines for the feature tasks were pushed back by a week. Our module teacher discovered that we actually have 10 weeks instead of 9, which provided us with some much-needed breathing room. This extension made a lot of the tasks feel more manageable and less rushed. 

I didn’t pick up anything particularly new during this module. Most of my time was spent working on documentation and refining the branching strategy, which is something I'm already comfortable with. Writing documentation is not something I mind; I’ve done a lot of it in the past, so it feels like second nature to me at this point.

The extra week has been a huge relief. It means I can take my time and avoid stressing or working overtime at home. I feel like I have more freedom now, which is great. There’s no pressure, and I don’t feel suffocated by deadlines. It also allows me to be more thorough in fixing any errors that may come up. 

Overall, the week has gone really well. It's been more relaxing, which makes the work more enjoyable and productive. When you’re not under constant pressure, you have more room to absorb information, reflect on your work, and, ultimately, learn more.

## Feedback Yves
Wenn du nichts neues gelernt hast, wäre die Frage, ob ihr nicht die Tasks anderst aufteilen hättet sollen, so dass du ebenfalls Berührungspunkte mit den DevOps Inhalten hast. Ihr könnt dies ja immer noch ändern.
