Author: Luke McCann
Student_num: U1364096
Course: Software Engineering (MEng)
Establishment: The University of Huddersfield

JavaSpaces Application designed by the request of the Assignment Specification
under module CHS2456 (Distributed Client and Server Systems).

Dependencies:

    $RIVER_HOME/apache-river-3.0.0/lib/jsk-lib.jar
    
    $RIVER_HOME/apache-river-3.0.0/lib/jsk-platform.jar
    
    $RIVER_HOME/apache-river-3.0.0/lib/outrigger.jar
    
    $RIVER_HOME/apache-river-3.0.0/lib/reggie.jar
    
    $RIVER_HOME/apache-river-3.0.0/lib-dl/reggie-dl.jar
    
These must be added to the modules list under project_structure/modules/dependencies
in order for the application to function, security requirements must
also be defined as a parameter under the configuration options:

    -Djava.security.policy=policy.all -Djava.rmi.server.useCodebaseOnly=false
    
An active JavaSpace is also required on the network:
    
     https://river.apache.org