# EDA Social App

# Keep In Mind That...

This is an example about how a microservice environment could be set up. This won't be the best way to get the job done since you will find as many nuances of microservices systems as many organizations which  adopt them. This example is realistic but differs in some extent from a production-grade system for the sake of convenience

* In the example, you will find many submodules, each of them will implement a microservice. In the real world, each microservice will have its own codebase with its own maintainers. Some companies have a package repository as well, so they can distribute common utility packages to all their subteams

* In the example, the 'environments' directory will contain all the configuration needed to run the system on a specific environment. In this case the only environment is "dev", or rather the developer's laptop. There are two main approaches to store environment configurations, both of them - hopefully - consider "configuration as code": the first approach centralize configs in separate codebases maintained by ops/platform teams, in the other approach the organizations follow the "you build it, you run it" approach, so each microservice is maintained along with its config. In this project I'm pretending to follow the first approach