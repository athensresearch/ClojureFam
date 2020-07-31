# Onboarding for New Clojurians

- [ ] implement @alaq's recommendations per https://github.com/athensresearch/ClojureFam/issues/52
- [ ] fix embeds
- [ ] fix links in README.md and rest of repo

Whimsical Embed: https://whimsical.com/VdBCZ1d33pzXR7H7h9uAen
re-frame vs redux comparison table: https://www.notion.so/athensresearch/6f7a5d4684c54328ad744ddf3dabe610?v=6ad5bf55c2b747d3b77fa393b48f8c02

# Learning Clojure(Script) Fundamentals

## Getting Help

Learning a new language can be intimidating. Especially a more avant-garde one like Clojure. But don't worry, you'll always have help! You can always ask questions in the #🧠-learning channel of our Discord or in the relevant channels of [http://clojurians.net/](http://clojurians.net/): #beginners, #re-frame, #datascript, etc.

## GitHub

If you haven’t already, subscribe to the [Athens repo](https://github.com/athensresearch/athens). See if you can make sense of the commits, issues, PRs of other devs. Hopefully their comments will give you context for Clojure in the wild.

If you want to learn with other like-minded individuals, you can join our Clojure learning program called [ClojureFam](https://github.com/athensresearch/ClojureFam/blob/master/doc/learning-in-public.md). It is a 5-week program with the ultimate goal of contributing to the Athens code base.

We have even started participating in the Learning in Public initiative by creating our own version: the [Learning Clojure in Public](https://github.com/athensresearch/ClojureFam/blob/master/doc/learning-in-public.md) initiative.

## Resources

Depending on how much time you have and how familiar you are with FPs/Lisps, I recommend spending 1-4 weeks with the following resources:

- Books and Other Text
    - [Clojure from the Ground Up](https://aphyr.com/tags/Clojure-from-the-ground-up) (suggest skipping Ch 5 "Macros" for now)
    - [Clojure for the Brave and True](https://www.braveclojure.com/clojure-for-the-brave-and-true/)
    - [Getting Clojure](https://pragprog.com/titles/roclojure/) (not a free resource, but highly recommended by the community)
- Problems and Exercises
    - [4Clojure](http://www.4clojure.com/)
    - [Exercism](https://exercism.io/tracks/clojure)
- 1-day Guided Workshop
    - [Clojure by Example](https://github.com/inclojure-org/clojure-by-example) (not for absolute beginner programmers)

## Cheatsheets

- [Clojure Cheatsheet](https://clojure.org/api/cheatsheet)
- [ClojureScript Cheatsheet](https://cljs.info/cheatsheet/)
- [ClojureDocs Quick Reference](http://clojuredocs.org/quickref)

## Questions to Evaluate Your Understanding

How well do you grok Clojure? That is, do you intuit the design principles and philosophy that Clojure embodies? Return to the questions below to evaluate your progress.

It should be noted that you are not expected to answer these questions perfectly as a beginner. Indeed, some of these questions may even make a Clojure sensei like Jeroen pause and think. Ultimately, there isn't one right answer. And as Socrates taught us, sometimes just sitting with the questions is good enough. 🙂

- Why are there so many **core functions** in clojure.core? What affordances does this give the programmer?
- What is a **persistent data structure**? What affordances does they give the programmer?
- Why is **concurrency** harder in some languages than others?
- Why is Clojure a **Lisp**? What affordances do Lisps give to programmers?
- What affordances does Clojure's **REPL** give to the programmer?
- Why is Clojure a **hosted language**? What affordances does this give the programmer?
- What is **lazy evaluation? W**hat are **lazy sequences**? Why might laziness be useful?

### Bonus Questions

- Why do Clojurians worship Rich Hickey?
- Who are your favorite Clojurians?
- Where do you see the principle of **accretion** at play in the Clojure world?
- Do you notice anything different about the Clojure community (e.g. on the Clojurians Slack or /r/clojure) compared to other language communities you've been a part of?

# IDE

One thing that you'll have to get used to if you haven't worked with Lisps/Emacs before is structural editing. This is because there are so many parens! You'll get used to it, and eventually even really like it! The following list has popular text editors and the main plugins used with them.

- VS Code: Calva
- Emacs: CIDER
- Intelli-J: Cursive
- Vim: Fireplace or Conjure
- Atom: Chlorine

Your text editor should give you hints as you type, and give you keybindings that easily pull docs and examples up. This is pretty important because there are so many (awesome!) functions in clojure.core, it's easy to forget their interfaces 😅.

One thing you will also have to adjust to is the REPL, but the REPL is your friend! See this [video](https://vvvvalvalval.github.io/posts/what-makes-a-good-repl.html) for how REPL-driven programming makes you more productive.

(Windows Users: Here is a [handy guide](https://www.notion.so/Beginner-Clojure-Environment-Setup-Windows-36f70c16b9a7420da3cd797a3eb712fa) to setting up a development environment. Made by our own [Baibhav Bista](https://www.notion.so/athensresearch/Baibhav-Bista-36529ba8af8f4764ad416dd53afc7192).)

# Re-frame

The core backbone of the Athens frontend is re-frame. It has quite a lot of docs, and they are entertaining to read, but they are pretty long and arguably not the best way to learn about re-frame. The most important thing you need to know about re-frame is that it is a better version of react-redux. See [here](https://www.learnreframe.com/).

[re-frame :: react-redux](https://www.notion.so/6f7a5d4684c54328ad744ddf3dabe610)

Re-frame introduces a few new concepts such as `fx` and `cofx`, and it's not a pure 1:1 mapping, but as you can see redux translates very well to re-frame.

IMO, a better way to learn re-frame than to read docs is to get your hands dirty with code and look at real-world examples. I recommend going through the following resources.

1. [re-frame tutorial by PurelyFunctional.tv](https://purelyfunctional.tv/guide/re-frame-building-blocks/)
2. [re-frame-10x TodoMVC](https://github.com/day8/re-frame-10x/tree/master/examples/todomvc). You can toggle the dashboard open and close with `ctrl-h`. 
3. [re-frame simple and TodoMVC](https://github.com/day8/re-frame/tree/master/examples/simple)
4. [re-posh TodoMVC](https://github.com/denistakeda/re-posh/tree/master/examples/todomvc](https://github.com/denistakeda/re-posh/tree/master/examples/todomvc))
5. [conduit](https://github.com/jacekschae/conduit) (ty Emmy)
6. [status.im](https://github.com/status-im/status-react) (ty tomismi)
7. [Blue Genes](https://github.com/intermine/bluegenes)

1 is a primer on re-frame, hiccup, and reagent. Read the entire thing.

2-4 are all repos you should clone, run locally, and tinker with. Seriously! **Actually experiment** with the code and see how the app changes.

For 4 you will have to know more about [datascript](https://www.notion.so/athensresearch/Onboarding-for-New-Clojurians-b34b38f30902448cae68afffa02425c1#9b2b499402f74292a326025969c360be). Basically, posh lets you use datascript with reagent (react). re-posh lets you use datascript with re-frame (redux). 

5 is a small example app that uses re-frame. It is pretty easy to wrap your head around.

6-7 are mature real world apps that use re-frame in production at scale.

# Datascript

Datascript is a database engine for the frontend. It is a port of an actual backend database, Datomic. The query language Datascript and Datomic are written is Datalog. Like SQL, Datalog is a declarative, logical programming language. Unlike SQL, it leverages set-logic, which makes for very flexible queries such as recursive queries and reverse lookups.

Similarly, Datascript and Datomic are very flexible engines with flexible schemas. All of this plays into the graph database that Roam/Athens is built off of. Indeed, it may be the secret sauce of this whole thing :)

1. [http://www.learndatalogtoday.org/](http://www.learndatalogtoday.org/)
2. [https://github.com/markbastian/datascript-playground/](https://github.com/markbastian/datascript-playground/)
3. [https://docs.datomic.com/on-prem/pull.html](https://docs.datomic.com/on-prem/pull.html)
4. [https://docs.datomic.com/on-prem/query.html](https://docs.datomic.com/on-prem/query.html)
5. [https://docs.datomic.com/on-prem/schema.html](https://docs.datomic.com/on-prem/schema.html)
6. [https://docs.datomic.com/on-prem/transactions.html](https://docs.datomic.com/on-prem/transactions.html)

#1 is a series of exercises, nothing crazy. It doesn't provide a ton of background, however, so you may want to reference the latter resources.

Similar to the TodoMVC apps, you should download #2 and evaluate each expression in the REPL as you go through the code. There are a lot of examples, just pick a few.

For 3-6, these are the Datomic docs that apply to Datascript as well. The others are superfluous for now.

# cljs-devtools

Even though we are compiling from ClojureScript to JavaScript, we can still leverage the awesomeness of Chrome DevTools! (Sorry Firefox people, it doesn't work as well.) You can set breakpoints *in* ClojureScript from the source tab and jump to code where errors have been thrown, just like in JavaScript! But also, you can print ClojureScript data. [Check it out](https://github.com/binaryage/cljs-devtools).

cljs-devtools, re-frame-10x, and the REPL will be invaluable not just for debugging your program, but also for interacting with, tinkering with, and reasoning about your program while you code.
