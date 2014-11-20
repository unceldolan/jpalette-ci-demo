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
