simpleapp
==============

Template for a simple Vaadin application that only requires a Servlet 3.0 container to run.


Workflow
========

To compile the entire project, run "mvn install".
To run the application, run "mvn jetty:run" and open http://localhost:8080/ .

To develop the theme, simply update the relevant theme files and reload the application.
Pre-compiling a theme eliminates automatic theme updates at runtime - see below for more information.

Debugging client side code
  - run "mvn vaadin:run-codeserver" on a separate console while the application is running
  - activate Super Dev Mode in the debug window of the application

To produce a deployable production mode WAR:
- change productionMode to true in the servlet class configuration (nested in the UI class)
- run "mvn clean vaadin:compile-theme package"
  - See below for more information. Running "mvn clean" removes the pre-compiled theme.
- test with "mvn jetty:run-war

An project For 
-------------------------
Baytus Salam Mohammadia Madrasa
বায়তুস্ সালাম মুহাম্মাদীয়া মাদরাসা
বঙ্গশাসন, ২৭ নং ওয়ার্ড, নাঃগঞ্জ সিটি করপোরেশন, নারায়নগঞ্জ
Mobile: 01911787497

