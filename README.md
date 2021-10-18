# PiBot
Linux deployable robot

**NOWHERE NEAR COMPLETE PLEASE DO NOT ATTEMPT TO USE**

# Installation & Setup

1. Create a maven run configuration
2. Set command to "install -f pom.xml" and profiles to "deploy" excluding the ""
3. In runner set the following properties
- myRobot.host -> IP Address of Robot
- myRobot.username -> Username for pi
- myRobot.passwd -> Password for pi's user
- myRobot.target -> Target deploy directory
