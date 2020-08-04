<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Clojure_logo.svg/256px-Clojure_logo.png">
</p>

<p align="center">
  <a href="https://github.com/athensresearch/ClojureFam/blob/master/doc/clojurefam-rosters.md">  
      <img src="https://img.shields.io/badge/cohorts-5-green" alt="Number of Cohorts">
  </a>
  <a href="https://github.com/athensresearch/ClojureFam/blob/master/doc/clojurefam-rosters.md">
      <img src="https://img.shields.io/github/issues-raw/athensresearch/clojurefam/learner?label=learners" alt="Number of Learners">
  </a>
  <a href="https://github.com/athensresearch/ClojureFam/blob/master/doc/learner-commits.md">
      <img src="https://img.shields.io/badge/commits-3-yellow" alt="Number of Commits">
  </a>
  <a href="https://discord.gg/5jVXv5A">
      <img src="https://img.shields.io/badge/join%20us%20-%20on%20Discord-blue" alt="Join us on Discord">
  </a>

> “The object of education is to teach us to love what is beautiful.”

— Plato, _The Republic_

# Purpose

To spread joy and create wealth by increasing the number of Clojure developers and strengthening relationships within the global Clojure community.

# Goals

1. Easier onboarding for Clojure devs
1. Easier onboarding for Athens contributors
1. Enlightenment

# Table of content

1. [Program Overview](#program-overview)
1. [Onboarding](#onboarding)
1. [Advanced Athens Libraries and Concepts](#advanced-athens-libraries-and-concepts)
1. [Learn in Public Initiative](#learn-in-public-initiative)
1. [Contribute](#contribute)

# Program Overview

If you are brand-new to Clojure, we suggest that you follow the resources and material in [Onboarding for New Clojurians](#onboarding).

- For new Clojurians, the goals of this program are (not necessarily in order):
  - Working through Clojure from the Ground Up, completing exercises.
  - Working through Brave Clojure, completing exercises.
  - Completing 100 problems on [4Clojure](https://www.4clojure.com/).
- For more advanced Learners: please adjust your goals to fit your current skill level.
- The program will culminate in the Learners working together to merge at least one Pull Request addressing an Athens issue.
- Each Learner will define their own checkpoints by submitting an issue to track their progress on the [ClojureFam Progress Board](https://github.com/athensresearch/ClojureFam/projects/2).
- Learners are encouraged to blog or Tweet about their experience learning Clojure, so as to get more people interested in the joy of Clojure programming. In fact, there is an ongoing initiative to [Learn Clojure in Public](#learn-in-public-initiative).
- Try to align yourself with the overall goals of this program:
  - Easier onboarding for Clojure devs
  - Easier onboarding for Athens contributors
  - Enlightenment
- As for Mentors: we tried to have Mentors for all Learners. This turned out to be unscalable. The number of new developers is increasing at a much higher rate than the number of senior Clojure developers. Because of this, we are currently prioritizing Learners who are contributing to the Athens source code to get any new Mentors that enter our program.

## Expectations for Learners

- Spend at least 5 weeks in the program with your Learner partner or team.
- Be proactive in communications. This includes in the Discord learning channel and in your team chat.
- Set goals and expectations for yourself.
- Aim to keep yourself and the Learners around you accountable and motivated.
- Learners are encouraged to have at least one synchronous video call / pair programming session per week with their partner, a member of their team, and/or their mentor.
- Be prepared to make revisions to code before a successful commit. The bar for quality of contributions may be high.
- The number of issues that you will be able to work on may vary. In fact, at times there may be more demand for issues than available issues to work on. In this case, be prepared to find other ways to contribute to Athens or other open source Clojure projects.
- When choosing an issue:
  1. Communicate about the issue
  2. Create a branch and a WIP pull request
  3. Ask for feedback

## Joining ClojureFam

Create a card on the [Looking for Study Group/Partner board](https://github.com/athensresearch/ClojureFam/projects/3). If you do not find anyone within a few days, please say something in the learning channel in our [Discord](https://discord.com/invite/7ztV74d).

## Getting Started

Once you have your cohort, and after introducing yourself to your team, please read the [Onboarding](#onboarding) document which will kickstart your journey and answer all the questions you may have.

# Onboarding

Welcome to the beginning of your Clojure journey!

If you're reading this it means you are getting started with ClojureFam and want to learn with other like-minded individuals.

## GitHub

If you haven’t already, subscribe to the [Athens repo](https://github.com/athensresearch/athens). See if you can make sense of the commits, issues, PRs of other devs. Hopefully their comments will give you context for Clojure in the wild.

## Getting Help

Learning a new language can be intimidating. Especially a more avant-garde one like Clojure. But don't worry, you'll always have help! You can always ask questions in the #🧠-learning channel of our Discord or in the relevant channels of [http://clojurians.net/](http://clojurians.net/): #beginners, #re-frame, #datascript, etc.

## IDE

One thing that you'll have to get used to if you haven't worked with Lisps/Emacs before is structural editing. This is because there are so many parens! You'll get used to it, and eventually even really like it! The following list has popular text editors and the main plugins used with them.

- VS Code: [Calva](https://calva.io)
- Intelli-J: [Cursive](https://cursive-ide.com/)
- Emacs: CIDER
- Vim: Fireplace or Conjure
- Atom: Chlorine

Your text editor should give you hints as you type, and give you keybindings that easily pull docs and examples up. This is pretty important because there are so many (awesome!) functions in clojure.core, it's easy to forget their interfaces 😅.

If you are a beginner we recommend VS Code or Cursive as there is very little set up and they come bundled with a lot of tools already (paredit (for paranthesis handling), formatter, linter, debugger, etc.).

The Athens [CONTRIBUTING.md](https://github.com/athensresearch/athens/blob/master/CONTRIBUTING.md#connecting-your-repl) document also has some good information on how to set up your REPL for use with the Athens Codebase.

One thing you will also have to adjust to is the REPL, but the REPL is your friend! See this [video](https://vvvvalvalval.github.io/posts/what-makes-a-good-repl.html) for how REPL-driven programming makes you more productive.

(Windows Users: Here is a [handy guide](https://www.notion.so/Beginner-Clojure-Environment-Setup-Windows-36f70c16b9a7420da3cd797a3eb712fa) to setting up a development environment. Made by our own [Baibhav Bista](https://www.notion.so/athensresearch/Baibhav-Bista-36529ba8af8f4764ad416dd53afc7192).)

## Curriculum

Whimsical Embed: https://whimsical.com/VdBCZ1d33pzXR7H7h9uAen

Depending on how much time you have and how familiar you are with FPs/Lisps, it is recommended to spend 1-4 weeks with the following resources:

- Books and Other Text

  - [Clojure from the Ground Up](https://aphyr.com/tags/Clojure-from-the-ground-up) (suggest skipping Ch 5 "Macros" for now)
  - [Clojure for the Brave and True](https://www.braveclojure.com/clojure-for-the-brave-and-true/) (suggest skipping ch11 (core.async), ch7 (only skip the section about Macros), ch8 (Writing Macros))

- Problems and Exercises

  - [4Clojure](http://www.4clojure.com/) - The problems are broken down by difficulty (Elementary, Easy, Medium and Hard). However, you might find it more useful to complete problems that match what you're reading. For example, if you've just read Chapter 4 of Clojure from the Ground Up (Sequences), give the problems that are tagged "seqs" a shot.
  - [Exercism](https://exercism.io/tracks/clojure) is optional but a good bonus, especially if you can get a mentor to review your code.

- Once you have reached Chapter 6 of Clojure from the Ground Up and you've learned about Atoms and State, you can start looking at the following resources. Gaining some baseline knowledge about re-frame, DataScript (& DataLog) will allow you to dive into the Athens Codebase and get started much quicker!

  - [Intro to ClojureScript](https://clojurescript.org/guides/quick-start)
  - [Intro to Reagent](https://reagent-project.github.io/)
  - [re-frame tutorial](https://purelyfunctional.tv/guide/re-frame-building-blocks)
  - Athens' [re-frame](#re-frame) and [datascript](#datascript) resources
  - [Learn DataLog Today](http://www.learndatalogtoday.org/)

- Paid Tutorial/Courses
  - 1-day Guided Workshop
    - [Clojure by Example](https://github.com/inclojure-org/clojure-by-example) (not for absolute beginner programmers)
  - [Getting Clojure](https://pragprog.com/titles/roclojure/) (not a free resource, but highly recommended by the community)

### Cheatsheets

Cheatsheets are very useful when you're getting started. Clojure has an extensive core library and you might not always remember the appropriate core function to handle a particular problem. If you're stuck, check the docs or a cheatsheet!

- [Clojure Cheatsheet](https://clojure.org/api/cheatsheet)
- [ClojureScript Cheatsheet](https://cljs.info/cheatsheet/)
- [ClojureDocs Quick Reference](http://clojuredocs.org/quickref)

Here are some other assorted resources that you might find useful -

- [Effective Programs - 10 Years of Clojure - Rich Hickey](https://www.youtube.com/watch?v=2V1FtfBDsLU)
- [History of Clojure - Rich Hickey](https://cdn.discordapp.com/attachments/708375112537342025/738747035808825534/clojure-hopl-iv-final.pdf)
- [Official Clojure Rationale](https://clojure.org/about/rationale)

### Questions to Evaluate Your Understanding

How well do you grok Clojure? That is, do you intuit the design principles and philosophy that Clojure embodies? Return to the questions below to evaluate your progress.

It should be noted that you are not expected to answer these questions perfectly as a beginner. Indeed, some of these questions may even make a Clojure sensei like Jeroen pause and think. Ultimately, there isn't one right answer. And as Socrates taught us, sometimes just sitting with the questions is good enough. 🙂

- Why are there so many **core functions** in clojure.core? What affordances does this give the programmer?
- What is a **persistent data structure**? What affordances does they give the programmer?
- Why is **concurrency** harder in some languages than others?
- Why is Clojure a **Lisp**? What affordances do Lisps give to programmers?
- What affordances does Clojure's **REPL** give to the programmer?
- Why is Clojure a **hosted language**? What affordances does this give the programmer?
- What is **lazy evaluation**? What are **lazy sequences**? Why might laziness be useful?

### Bonus Questions

- Why do Clojurians worship Rich Hickey?
- Who are your favorite Clojurians?
- Where do you see the principle of **accretion** at play in the Clojure world?
- Do you notice anything different about the Clojure community (e.g. on the Clojurians Slack or /r/clojure) compared to other language communities you've been a part of?

# Advanced Athens Libraries and Concepts

## re-frame

The core backbone of the Athens frontend is re-frame. It has quite a lot of docs, and they are entertaining to read, but they are pretty long and arguably not the best way to learn about re-frame. The most important thing you need to know about re-frame is that it is a better version of react-redux.

Re-frame introduces a few new concepts such as `fx` and `cofx`, and it's not a pure 1:1 mapping, but as you can see redux translates very well to re-frame.

| re-frame-10x | Redux DevTools     |
| ------------ | ------------------ |
| events       | actions/reducer    |
| db           | store              |
| subscribe    | mapStateToProps    |
| dispatch     | mapDispatchToProps |
| subs         |                    |
| fx           |                    |
| cofx         |                    |

A better way to learn re-frame than to read docs is to get your hands dirty with code and look at real-world examples. We recommend going through the following resources.

1. [re-frame tutorial by PurelyFunctional.tv](https://purelyfunctional.tv/guide/re-frame-building-blocks/) and [re-frame's documentation's about the data loop](https://day8.github.io/re-frame/a-loop/)

   At this point you should try to build something of your own. It can be a small re-frame application that does one thing and is ideally something you would use (think pomodoro timer, tip calculator, weather widget, etc.). For examples of applications built by past learners check out - [Pomato](https://github.com/itsrainingmani/pomato) & [Hail-the-wheel](https://github.com/alaq/hail-the-wheel).

2. [re-frame-10x TodoMVC](https://github.com/day8/re-frame-10x/tree/master/examples/todomvc). You can toggle the dashboard open and close with `ctrl-h`.
3. [re-frame simple and TodoMVC](https://github.com/day8/re-frame/tree/master/examples/simple)
4. [conduit](https://github.com/jacekschae/conduit) (h/t Emmy)
5. [status.im](https://github.com/status-im/status-react) (h/t tomismi)
6. [Blue Genes](https://github.com/intermine/bluegenes)

1 is a primer on re-frame, hiccup, and reagent. Read the entire thing.

2-3 are all repos you should clone, run locally, and tinker with. Seriously! **Actually experiment** with the code and see how the app changes.

4 is a small example app that uses re-frame. It is pretty easy to wrap your head around.

5-6 are mature real world apps that use re-frame in production at scale.

## DataScript

DataScript is a database engine for the frontend. It is a port of an actual backend database, Datomic. The query language DataScript and Datomic are written is Datalog. Like SQL, DataLog is a declarative, logical programming language. Unlike SQL, it leverages set-logic, which makes for very flexible queries such as recursive queries and reverse lookups.

Similarly, DataScript and Datomic are very flexible engines with flexible schemas. All of this plays into the graph database that Roam/Athens is built off of. Indeed, it may be the secret sauce of this whole thing :)

1. [http://www.learndatalogtoday.org/](http://www.learndatalogtoday.org/)
2. [https://github.com/markbastian/datascript-playground/](https://github.com/markbastian/datascript-playground/)
3. [https://docs.datomic.com/on-prem/pull.html](https://docs.datomic.com/on-prem/pull.html)
4. [https://docs.datomic.com/on-prem/query.html](https://docs.datomic.com/on-prem/query.html)
5. [https://docs.datomic.com/on-prem/schema.html](https://docs.datomic.com/on-prem/schema.html)
6. [https://docs.datomic.com/on-prem/transactions.html](https://docs.datomic.com/on-prem/transactions.html)

\#1 is a series of exercises to familiarize you with DataLog syntax and common operations, nothing crazy. It doesn't provide a ton of background, however, so you may want to reference the latter resources.

Similar to the TodoMVC apps, you should download #2 and evaluate each expression in the REPL as you go through the code. There are a lot of examples, just pick a few.

For 3-6, these are the Datomic docs that apply to DataScript as well. The others are superfluous for now.

## cljs-devtools

Even though we are compiling from ClojureScript to JavaScript, we can still leverage the awesomeness of Chrome DevTools! (Sorry Firefox people, it doesn't work as well.) You can set breakpoints _in_ ClojureScript from the source tab and jump to code where errors have been thrown, just like in JavaScript! But also, you can print ClojureScript data. [Check it out](https://github.com/binaryage/cljs-devtools).

cljs-devtools, re-frame-10x, and the REPL will be invaluable not just for debugging your program, but also for interacting with, tinkering with, and reasoning about your program while you code.

# Learn in Public Initiative

Write blogs and guides and walkthroughs.  
&nbsp;&nbsp;&nbsp;Make video tutorials or stream on Twitch.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Speak at meetups and conferences. Tweet.

Start your own newsletter. Write about what you learn.
&nbsp;&nbsp;&nbsp;Ask and answer things on StackOverflow.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Keep yourself accountable. Inspire the community.

## List of Learn in Public projects

- [@alaq's Learning Clojure in Public Github repo](https://github.com/alaq/learning-clojure-in-public)
- [@itsrainingmani's Learning Clojure in Public Github repo](https://github.com/itsrainingmani/learn-clojure-in-public)
- [@banditelol's Blog about Learning Clojure in Public](https://blog.adityarp.com/learn-clojure-day-0/)
- [@nthd3gr33's Learning Clojure in Public Github repo](https://github.com/nthd3gr33/learn-clojure-in-public)

## Join Us

If you want to join us in the Learning in Public initiative, just do it! Make a Github repo and we can link it here. Tweet about it and we can retweet you. Happy learning!

# Contribute to ClojureFam

Check out our [Project Board](https://github.com/athensresearch/ClojureFam/projects/1) and come talk to us in the #🏫-school-builders channel in our [Discord](https://discord.gg/5jVXv5A).
