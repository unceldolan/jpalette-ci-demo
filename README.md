jpalette-ci-demo
================

A short intro to continuous integration with Travis CI.

Introduction
------------
This activity will show you how to link up a public github repository to Travis CI [travis-ci.org](http://travis-ci.org). Travis CI is an online tool that automatically runs/builds/tests your code whenever you commit and push changes up to github.

First, you are going to need a github account - or at least one person in your group will need an account. Once you have an account ready, fork this project into your own repository (using the github fork button). Also, give me your github username and contributor access to the forked repo (more on this later). My github username is **skkroh**.

Then, follow the steps at [Travis CI: Getting Started](http://docs.travis-ci.com/user/getting-started/) to link your copy of this demo project into Travis CI. The demo will talk about a certain '.travis.yml' file - this is present in your forked copy of the demo project.

The Task
--------
JPalette is a simple repository (Swatch) of colors that a graphic designer could use to store related colors used in a project. A single swatch may be saved out to a file (e.g. swatch.txt) or loaded back into memory. This is done by providing the name of the swatch (minus the extension) as a java command line parameter. So to load in swatch.txt, run: 
**java JPalette swatch.**

The catch is colors may be added in various formats: RGB (red, green, blue), CYMK (cyan, yellow, magenta, and black), and hexadecimal (HTML style). Every color object requires the ability to generate equivalent colors in the various formats. So: you will need to implement the Color.toRgb(), Color.toHex(), and Color.toCymk() functions. The algorithms to do this are simple. See these pages for more: [CMYK to RGB](http://www.rapidtables.com/convert/color/cmyk-to-rgb.htm), [RGB to CMYK](http://www.rapidtables.com/convert/color/rgb-to-cmyk.htm), [RGB to Hex](http://www.rapidtables.com/convert/color/rgb-to-hex.htm). I've given a few hints along the way in the source files.

Additionally, there is some work that needs to be done in Swatch.java, however this is pretty simple. 

The tests are there - what you have to do is fill in the missing blanks, committing and pushing your code after every step is complete. The overall goal is to get you to add a few features over time and see how Travis handles those.
After each push, Travis will build your code separately and present you with the build log. Focus on getting one color to translate correctly first; I would reccomment starting with RGB. 


Development
-----------
You can import the cloned github project into eclipse and work from there. However, on Travis' side, the ant build script (build.xml) is used to build the project and run tests on it.


The Lazy Developer
------------------
This simulation also has a bonus. Along the way, I might introduce bugs into your code, which you will have to identify via Travis' log.

Dropbox Submission
------------------
By Saturday at 11:59 PM, submit a short writeup (PDF) that shows a screenshot of Travis after you've finished implementing as much as we get through in class. Also, include a paragraph or two about the activity. If I do get around to adding a bug to your repository, also identify in the submission when that occured, and how you fixed it.

A Bit More
----------
If you're curious, you can do a whole lot of configuration with Travis. The .travis.yml file allows you to specify multiple versions of runtimes to bulid and run against. So you could test this application for instance under Java 1.6, 1.7, and 1.8 simultaneously. You can also set up and tear down environment variables, install .deb packages, etc.
[Travis Build Configuration](http://docs.travis-ci.com/user/build-configuration/).

Afterwards
----------
I honestly don't know how long this activity will take - probably not the whole class period. If we have time, your team might consider looking into one of these projects (one you haven't heard of). Compare them against Travis. How might you use them to aid software development, especially within integration or deployment?

[Vagrant](https://www.vagrantup.com/), [Salt Stack](http://www.saltstack.com/), [Docker](https://www.docker.com/), [Jenkins] (http://jenkins-ci.org/)
