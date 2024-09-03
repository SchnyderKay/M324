# Devops Process

## SDLC (Software Development Lifecycle)
-----------------------------------------

SDLC is like the name suggest a lifecycle to develop software with the focus on quiality, structure and cost control. This process consist of seven different phases, which are planned out to ensure clear goals. The following phases can be used in different kind of settings like a waterfall model or and agil working method. Depending on the team these phases can be repeated in a cycle or for a short one time project it can also only be executed ones.

<img src="./Images/SDLC.png" width="400" height="400">

*SDLC, Source: medium.com*

### Phases

**Planning & Analysis**

The first stage in the Software Developement Cycle is the planning stage, during which requirements are gathered from clients and stakeholders. 
In this stage, you evaluate whether the product can be developed by considering factors like potential earnings, costs, and user needs. 
To determine if a feature will be developed and where it should be prioritized, various aspects such as user needs and business goals are considered.

**Define Requirements**

In this stage the before gatherd information are used to create specific requirements for the software. A part of these Specification are User stories and product specifications. These cirteria are later used to define the design and generate a fitting application for the users and the client.

**Design**

During the design phase, the application is carefully planned out on paper. This includes creating flowcharts and wireframes. The design process covers not only the visual aspects of the software but also the system design, programming language, platform, and application security measures. This approach helps the team visualize the final product and make adjustments before committing to development.

**Development**

According to the set timeline and the milestones the code is divided in smaller parts and then inplemented by the developers. In certain situation it makes sense to merge the developement and testing stage, so that the quality of the application can be asured even early in the progess. 

**Testing**

To ensure quality after completing the code, testing is necessary. There are different types of testing, such as performance, functional, security, unit, usability, and acceptance testing. These tests ensure that the application is secure and provides a good user experience. If the tests do not succeed, the code needs to be improved for another round of quality control.

**Deployment**

This is the second-to-last stage in the cycle, focusing on the deployment of the product. During this step, the application is delivered to its intended users. This process can be completed through an automated pipeline or manually. After the first cycle is completed, this step can be used to increase the software version with minor and major updates.

**Maintainance**

The final step is the maintenance part. Here, the client or user can report bugs or flaws, which can be fixed immediately, or a new cycle can be started to tackle new features and bugs. The maintenance stage is mainly used in the waterfall structure because there is no repeating cycle like in agile methods.

## Devops Lifecycle
--------------------

The DevOps lifecycle can be presented as a circle or an infinity loop. It is based on the Agile methodology and focuses on continuous feedback. Not every implementation of the DevOps lifecycle has the same amount of phases, but here are the most common: 

![image info](./Images/DevOps-Lifecycle.jpg)
*DevOps Lifecycle, Source: browserstack.com*

### Phases

**Plan** 

The planning stage is there to plan the different stages of the lifecycle. Unlike in other methods, with the DevOps lifecycle, it is expected that every stage can be repeated multiple times due to the continuous feedback. Therefore, it needs to be planned accordingly so that there can be multiple iterations of each stage and even a cycle. It is important to revisit the planning stage at the beginning of a lifecycle and take the last iteration of the process into account for the planning as well. During this stage all teams need to be present so that so information is lost or steps are forgotten. 

**Code**

During the coding stage, the developer implements the new feature or program according to the requirements listed in the planning stage. The code also needs to be prepared for the next phase, which is the build phase.

**Build**

During the build phase, the code is implemented into the existing project. The rest of the project or the code itself needs to be adjusted if necessary. Afterward, a review is requested with the help of the new code. A variety of tools can be used, but the most popular is a version control tool such as GitHub.

**Test**

The testing phase exists, so that the responsible team can test the code for bugs or errors. For this, there are various kinds of tests, such as black-box or white-box testing, unit testing, end-to-end testing, system testing, and similar testing strategies. These ensure the quality of the product before it's shipped to the costumers.

**Release**

When no bugs or errors are found in the testing phase, the project enters the release phase. In this stage, the project is made ready to be released, and if all set checks pass, the next step is initiated.

**Deploy**

In this stage, the project gets made ready to be run in the production environment. Ensuring that everything works smoothly is either the responsibility of the operations team or a shared responsibility within the different DevOps teams. 

**Operate**

During the second to last stage, the project is tested in a productive environment, and the users bring the project into service. To make sure the project runs for each user, the program and environment are configured according to the wishes of the client. This stage can also be used to inform the teams for future runs of the lifecycle.

**Monitor**

In the last phase, which is the monitoring stage, product usage, feedback, and issues are identified and documented to inform the next iteration. This information can be gathered from within the DevOps team or through feedback from clients and users. This phase is crucial for planning and streamlining the development pipeline.

## SDLC vs Devops Lifecycle
----------------------------

SDLC focuses, not like the DevOps lifecycle, more on a linear and structured workflow. DevOps, on the other hand, focuses more on automation and the communication between the teams and phases. Therefore, the SDLC isn't commonly used in the agile world of software development anymore. One key difference is that feedback in the SDLC is only gathered at the end of the cycle and not at the end of every stage, like in the DevOps lifecycle. Therefore, the necessary feedback is late for improvement and another cycle needs to be started to revise possible issues. 

## MVP (Minimum Viable Product)
--------------------------------

A Minimum Viable Product (MVP) is the simplest version of a product that includes only the main features necessary to validate a concept and gather user feedback. It allows teams to quickly test ideas, learn from real user interactions, and make ongoing improvements based on that feedback. The DevOps lifecycle supports this mindset and uses this idea to support the continuous implementation and improvement of the product. Through this approach, time can be saved, which would otherwise be invested in unnecessary features, and bugs can be eliminated in a timely manner. 

## Sources

- [theproductmanager](https://theproductmanager.com/topics/software-development-life-cycle/) was used for the **SLDC** information
- [Browserstack](https://www.browserstack.com/guide/devops-lifecycle) was the source for the **DevOps** image and additional information
- [IBaseIt](https://www.ibaseit.com/blog/software-development-life-cycle-sdlc-models-phases/) was used for the **SDLC** informations and the fitting image
- [DistantJob](https://distantjob.com/blog/mvp-development/#:~:text=MVP%20stands%20for%20Minimum%20Viable,in%20its%20development%20is%20warranted.) was used for the information about **MVP**
