## Spring 版本关系



| SpringBoot                                                   | Spring Framework                                             | Spring Cloud                                                 | Spring Cloud Alibaba                                         |      |      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | ---- |
| [2.3.7.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.7.RELEASE/reference/html/) | [5.2.12.RELEASE](https://docs.spring.io/spring/docs/5.2.12.RELEASE/spring-framework-reference/) |                                                              |                                                              |      |      |
| [2.3.6.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.6.RELEASE/reference/html/) | [5.2.11.RELEASE](https://docs.spring.io/spring/docs/5.2.11.RELEASE/spring-framework-reference/) |                                                              |                                                              |      |      |
| [2.3.5.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/html/) | [5.2.10.RELEASE](https://docs.spring.io/spring/docs/5.2.10.RELEASE/spring-framework-reference/) | [Hoxton.SR9](https://docs.spring.io/spring-cloud/docs/Hoxton.SR9/reference/html/) |                                                              |      |      |
| [2.3.4.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/html/) | [5.2.9.RELEASE](https://docs.spring.io/spring/docs/5.2.9.RELEASE/spring-framework-reference/) |                                                              |                                                              |      |      |
| [2.3.3.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/html/) | [5.2.8.RELEASE](https://docs.spring.io/spring/docs/5.2.8.RELEASE/spring-framework-reference/) | [Hoxton.SR8](https://docs.spring.io/spring-cloud/docs/Hoxton.SR8/reference/html/) |                                                              |      |      |
| [2.3.2.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/) | [5.2.8.RELEASE](https://docs.spring.io/spring-framework/docs/5.2.8.RELEASE/spring-framework-reference/) | [Hoxton.SR7](https://docs.spring.io/spring-cloud/docs/Hoxton.SR7/reference/html/) | 2.2.4.RELEASE                                                |      |      |
| [2.3.1.RELEASE](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/) | [5.2.7.RELEASE](https://docs.spring.io/spring/docs/5.2.7.RELEASE/spring-framework-reference/) | [Hoxton.SR6](https://docs.spring.io/spring-cloud/docs/Hoxton.SR6/reference/html/) |                                                              |      |      |
|                                                              |                                                              |                                                              |                                                              |      |      |
|                                                              |                                                              | Hoxton.SR3                                                   | [2.2.1.RELEASE](https://spring-cloud-alibaba-group.github.io/github-pages/hoxton/en-us/index.html) |      |      |
|                                                              |                                                              | Hoxton.RELEASE                                               | 2.2.0.RELEASE                                                |      |      |
|                                                              |                                                              | greenwich                                                    | [2.1.2.RELEASE](https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html) |      |      |
|                                                              |                                                              | Greenwich                                                    | 2.1.0.RELEASE                                                |      |      |
|                                                              |                                                              |                                                              |                                                              |      |      |
|                                                              |                                                              |                                                              |                                                              |      |      |
|                                                              |                                                              | finchley                                                     | [2.0.2.RELEASE](https://spring-cloud-alibaba-group.github.io/github-pages/finchley/spring-cloud-alibaba.html) |      |      |
|                                                              |                                                              | edgware                                                      | [1.5.0.RELEASE](https://spring-cloud-alibaba-group.github.io/github-pages/edgware/spring-cloud-alibaba.html) |      |      |
|                                                              |                                                              |                                                              |                                                              |      |      |



### Spring Cloud Alibaba版本

- 1.5.x 版本适用于 Spring Boot 1.5.x
- 2.0.x 版本适用于 Spring Boot 2.0.x
- 2.1.x 版本适用于 Spring Boot 2.1.x
- 2.2.x 版本适用于 Spring Boot 2.2.x



### Alpha、Beta、Gamma版本

以下三者，在系统、架包、软件的开发过程中，使用。
Alpha：内测版，BUG多，开发人员开发过程中使用，希腊字母α，第一，指最初版
Beta：早期版本，有缺陷，无大BUG，可能加入新功能，进一步开发完善。
Gamma: 经beta 版，完善修改，成为正式发布的候选版本（Release Candidate）

### RC、GA、R版本

RC：(Release Candidate)：候选版本，几乎就是正式版了，
GA：（Ggeneral Availability）：发行稳定版，官方推荐使用此版本。
R，RELEASE：正式版，等价于GA

### SNAPSHOT版本

- SNAPSHOT：快照版，可以稳定使用，且仍在继续改进版本。
- snapshot多见于架包依赖中，使用Maven时，需要的架包回去仓库Nexus中找，，一个仓库一般分为RELEASE仓和SNAPSHOT仓快照版，前者理解，稳定正式版本，后者如何？Maven在构建项目时，会优先去远程仓库中查看是否有最新的example-1.0-SNAPSHOT.jar，如果有则下载下来使用。即使本地仓库中已经有了example-1.0-SNAPSHOT.jar，它也会尝试去远程仓库中查看同名的jar是否是最新的。
- 有的人可能会问，这样不就不能充分利用本地仓库的缓存机制了吗？别着急，Maven比我们想象中的要聪明。在配置Maven的Repository的时候中有个配置项，可以配置对于SNAPSHOT版本向远程仓库中查找的频率。频率共有四种，分别是always、daily、interval、never。当本地仓库中存在需要的依赖项目时，always是每次都去远程仓库查看是否有更新，daily是只在第一次的时候查看是否有更新，当天的其它时候则不会查看；interval允许设置一个分钟为单位的间隔时间，在这个间隔时间内只会去远程仓库中查找一次，never是不会去远程仓库中查找（这种就和正式版本的行为一样了）。