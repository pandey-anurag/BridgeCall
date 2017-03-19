# BridgeCall
Bridge btwn R/Python ,requires Jython,Rengine,Rserve.
 1. Python Call:
 Attached a sample Python File. 2 i/p->1 o/p.
 2.R call
 Activate Rserve in R prompt using following commands:
 install.packages("Rserve")--> installs Rserve
 library(Rserve) 
 Rserve() --> Starts server
 Rserve(port=6311)--> Intializes Port for TCP/IP (Required)
