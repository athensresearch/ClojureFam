# Onboarding

Welcome to the beginning of your Clojure journey!

If you're reading this it means you are getting started with ClojureFam and want to learn with other like-minded individuals.

## Getting Help

Learning a new language can be intimidating. Especially a more avant-garde one like Clojure. But don't worry, you'll always have help! You can always ask questions in the #🧠-learning channel of our Discord or in the relevant channels of [http://clojurians.net/](http://clojurians.net/): #beginners, #re-frame, #datascript, etc.

## GitHub

If you haven’t already, subscribe to the [Athens repo](https://github.com/athensresearch/athens). See if you can make sense of the commits, issues, PRs of other devs. Hopefully their comments will give you context for Clojure in the wild.

We have even started participating in the Learning in Public initiative by creating our own version: the [Learning Clojure in Public](https://github.com/athensresearch/ClojureFam/blob/master/doc/learning-in-public.md) initiative.

## IDE

One thing that you'll have to get used to if you haven't worked with Lisps/Emacs before is structural editing. This is because there are so many parens! You'll get used to it, and eventually even really like it! The following list has popular text editors and the main plugins used with them.

-   VS Code: [Calva](https://calva.io)
-   Intelli-J: [Cursive](https://cursive-ide.com/)
-   Emacs: CIDER
-   Vim: Fireplace or Conjure
-   Atom: Chlorine

Your text editor should give you hints as you type, and give you keybindings that easily pull docs and examples up. This is pretty important because there are so many (awesome!) functions in clojure.core, it's easy to forget their interfaces 😅.

If you are a beginner we recommend VS Code or Cursive as there is very little set up and they come bundled with a lot of tools already (paredit (for paranthesis handling), formatter, linter, debugger, etc.).

The Athens [CONTRIBUTING.md](https://github.com/athensresearch/athens/blob/master/CONTRIBUTING.md#connecting-your-repl) document also has some good information on how to set up your REPL for use with the Athens Codebase.

One thing you will also have to adjust to is the REPL, but the REPL is your friend! See this [video](https://vvvvalvalval.github.io/posts/what-makes-a-good-repl.html) for how REPL-driven programming makes you more productive.

(Windows Users: Here is a [handy guide](https://www.notion.so/Beginner-Clojure-Environment-Setup-Windows-36f70c16b9a7420da3cd797a3eb712fa) to setting up a development environment. Made by our own [Baibhav Bista](https://www.notion.so/athensresearch/Baibhav-Bista-36529ba8af8f4764ad416dd53afc7192).)

## Curriculum

Whimsical Embed: https://whimsical.com/VdBCZ1d33pzXR7H7h9uAen

Depending on how much time you have and how familiar you are with FPs/Lisps, it is recommended to spend 1-4 weeks with the following resources:

-   Books and Other Text

    -   [Clojure from the Ground Up](https://aphyr.com/tags/Clojure-from-the-ground-up) (suggest skipping Ch 5 "Macros" for now)
    -   [Clojure for the Brave and True](https://www.braveclojure.com/clojure-for-the-brave-and-true/) (suggest skipping ch11 (core.async), ch7 (only skip the section about Macros), ch8 (Writing Macros))

-   Problems and Exercises

    -   [4Clojure](http://www.4clojure.com/) - The problems are broken down by difficulty (Elementary, Easy, Medium and Hard). However, you might find it more useful to complete problems that match what you're reading. For example, if you've just read Chapter 4 of Clojure from the Ground Up (Sequences), give the problems that are tagged "seqs" a shot.
    -   [Exercism](https://exercism.io/tracks/clojure) is optional but a good bonus, especially if you can get a mentor to review your code.

-   Once you have reached Chapter 6 of Clojure from the Ground Up and you've learned about Atoms and State, you can start looking at the following resources. Gaining some baseline knowledge about re-frame, DataScript (& DataLog) will allow you to dive into the Athens Codebase and get started much quicker!

    -   Intro to ClojureScript
    -   [Intro to Reagent](https://reagent-project.github.io/)
    -   [re-frame tutorial](https://purelyfunctional.tv/guide/re-frame-building-blocks)
    -   Athens' [re-frame](./re-frame.md) and [datascript](./datascript.md) ressources
    -   [Learn DataLog Today](http://www.learndatalogtoday.org/)

-   Paid Tutorial/Courses
    -   1-day Guided Workshop
        -   [Clojure by Example](https://github.com/inclojure-org/clojure-by-example) (not for absolute beginner programmers)
    -   [Getting Clojure](https://pragprog.com/titles/roclojure/) (not a free resource, but highly recommended by the community)

### Cheatsheets

Cheatsheets are very useful when you're getting started. Clojure has an extensive core library and you might not always remember the appropriate core function to handle a particular problem. If you're stuck, check the docs or a cheatsheet!

-   [Clojure Cheatsheet](https://clojure.org/api/cheatsheet)
-   [ClojureScript Cheatsheet](https://cljs.info/cheatsheet/)
-   [ClojureDocs Quick Reference](http://clojuredocs.org/quickref)

Here are some other assorted resources that you might find useful -

-   [Effective Programs - 10 Years of Clojure - Rich Hickey](https://www.youtube.com/watch?v=2V1FtfBDsLU)
-   [History of Clojure - Rich Hickey](https://cdn.discordapp.com/attachments/708375112537342025/738747035808825534/clojure-hopl-iv-final.pdf)
-   [Official Clojure Rationale](https://clojure.org/about/rationale)

### Questions to Evaluate Your Understanding

How well do you grok Clojure? That is, do you intuit the design principles and philosophy that Clojure embodies? Return to the questions below to evaluate your progress.

It should be noted that you are not expected to answer these questions perfectly as a beginner. Indeed, some of these questions may even make a Clojure sensei like Jeroen pause and think. Ultimately, there isn't one right answer. And as Socrates taught us, sometimes just sitting with the questions is good enough. 🙂

-   Why are there so many **core functions** in clojure.core? What affordances does this give the programmer?
-   What is a **persistent data structure**? What affordances does they give the programmer?
-   Why is **concurrency** harder in some languages than others?
-   Why is Clojure a **Lisp**? What affordances do Lisps give to programmers?
-   What affordances does Clojure's **REPL** give to the programmer?
-   Why is Clojure a **hosted language**? What affordances does this give the programmer?
-   What is **lazy evaluation**? What are **lazy sequences**? Why might laziness be useful?

#### Bonus Questions

-   Why do Clojurians worship Rich Hickey?
-   Who are your favorite Clojurians?
-   Where do you see the principle of **accretion** at play in the Clojure world?
-   Do you notice anything different about the Clojure community (e.g. on the Clojurians Slack or /r/clojure) compared to other language communities you've been a part of?

## cljs-devtools

Even though we are compiling from ClojureScript to JavaScript, we can still leverage the awesomeness of Chrome DevTools! (Sorry Firefox people, it doesn't work as well.) You can set breakpoints _in_ ClojureScript from the source tab and jump to code where errors have been thrown, just like in JavaScript! But also, you can print ClojureScript data. [Check it out](https://github.com/binaryage/cljs-devtools).

cljs-devtools, re-frame-10x, and the REPL will be invaluable not just for debugging your program, but also for interacting with, tinkering with, and reasoning about your program while you code.
