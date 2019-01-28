# GodRandom

**God Random** is a simple desktop app, which generates a random choice from a list given by the user. This app is split in two modes: simple and multiple.

## Table of Contents

- [Motivation](#motivation)
- [Implementation](#implementation)
- [Simple Mode](#simple-mode)
- [Multiple Mode](#multiple-mode)
- [Future Work](#future-work)



## Motivation

The motivation behind this app was just for personal purposes. The idea came from an event where my friends and I wanted to organize a gaming day and avoid choosing the list of games we were going to play. The simple reason of that is that it's hard to everybody agree to play the same games. So we believed that the best way to do that was to push the decisions to the **God Random**.



## Implementation

The app was implemented in Java. The front-end was made using the widget toolkit Swing and the back-end is just the events handlers and the generation of the random selection, which is made by calling the class **java.util.Random**.



## Simple Mode

This mode is the simplest random selection possible. The user only needs to build his list of items and click 'Start' to get one only item from this list. A example can be seen in figure below.

![alt text](/images/simple_example.png "Example of the use of the simple mode")



## Multiple Mode

Multiple mode requires the items to be organized into categories. The figure below shows an example of input.

![alt text](/images/multiple_input_example.png "Example of an input to the multiple mode")

The way this mode works it's basically run the Random into every category. Our idea was every participant choose a game of every category to build a list of games in each category and posteriorly the **God Random** pick a game of every category. But before that, to create the order of when we play each game, the list of categories is shuffled, using the method *shuffle()* from the class **java.util.Collections**. You can see an example of output in the figure below.

![alt text](/images/multiple_example.png "Example of the use of the multiple mode")



## Future Work

Here are some suggestions for updates to the app, if I feel like it.

* **Read from a CSV file or similar:** if we have data bigger than usual, such as 15 categories and 12-17 items each, in the best case we must enter 180 items into the app. Well, it's boring do that by hand, so it's a good idea to accept a csv, xlsx or similar file as input.

* **Create installers:** this point is just to ensure the app works on as many systems as possible.
