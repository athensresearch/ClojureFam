<h1 align="center">ClojureFam</h1>

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Clojure_logo.svg/256px-Clojure_logo.png">
</p>
<p align="center">
  <a href="https://discord.gg/5jVXv5A">
      <img src="https://img.shields.io/discord/708122962422792194?label=discord&logo=Discord" alt="Join us on Discord">
  </a>
</p>

> “The object of education is to teach us to love what is beautiful.”

— Plato, _The Republic_

# About

ClojureFam is a learning program for those who want to get a taste of Clojure(Script) and DataScript, two of the most powerful and elegant technologies that exist today.

By understanding ClojureScript, a functional, immutable Lisp, and DataScript, a Semantic Web-inspired, set-based graph database, you will not only level up as a developer, you will also understand the ideas and architecture behind networked Tools for Thought like Roam, LogSeq, and Athens.

Learners are assumed to have **no Clojure or functional programming experience.**

Learners complete the program when they merge code into the [Athens](https://github.com/athensresearch/athens) codebase, becoming a Contributor and gaining access to [Contributor-only channels](https://github.com/athensresearch/athens/blob/master/CONTRIBUTING.md).

The program consists of 1) curated learning material, 2) social accountability via #learninpublic and peer-to-peer study, 3) and mentorships and office hours with experienced Clojurians.

The program expects 35 days of 1-hour study, or 5 weeks of part-time study (~10 hours per week). We also expect you to genuinely try to work with your group, if you end up forming one.

That said, take whatever you like. If you only want to use the learning material but want to learn solo, that's fine! If you want to use different learning material, but want to share your journey on our Discord, that's great too!

As always, if you have feedback and ideas on how we can improve, please share in our [Discord](https://discord.gg/5jVXv5A)!

# Learning Material

TLDR: This [issue template](https://github.com/athensresearch/ClojureFam/issues/new?template=progress_template.md&title=YOUR+NAME+Progress).

<details>
<summary>Long Version</summary>

- Getting Help: Learning a new language can be intimidating. Especially a more avant-garde one like Clojure. But don't worry, you'll always have help!
  - Athens Discord channels: #learning, #engineering, #learn-in-public
  - [Clojurians Slack](http://clojurians.net/): #beginners, #re-frame, #datascript, etc.
  - [Clojurians Zulip](https://clojurians.zulipchat.com/)
- IDE: One thing that you'll have to get used to if you haven't worked with Lisps/Emacs before is structural editing. This is because there are so many parens!
  - Popular editors and their plugins:
    - VS Code: Calva
    - Intelli-J: Cursive
    - Emacs: CIDER
    - Vim: Fireplace or Conjure
    - Atom: Chlorine
    - Your text editor should give you hints as you type, and give you keybindings that easily pull docs and examples up. This is pretty important because there are so many (awesome!) functions in clojure.core, it's easy to forget their interfaces 😅.
  - If you are a beginner, we recommend VS Code or Cursive as there is very little set up and they come bundled with a lot of tools already (paredit, formatting, linting, debugging, etc.).
  - See Athens [CONTRIBUTING.md](https://github.com/athensresearch/athens/blob/master/CONTRIBUTING.md#connecting-your-repl) for how to set up your REPL for use with the Athens Codebase.
- REPL: the REPL is your friend! See this [video](https://vvvvalvalval.github.io/posts/what-makes-a-good-repl.html) for how REPL-driven programming makes you more productive.
- [Athens Stack Mind Map - what to know and what not to know](https://whimsical.com/VdBCZ1d33pzXR7H7h9uAen)
- Books and Tutorials
  - [Clojure from the Ground Up](https://aphyr.com/tags/Clojure-from-the-ground-up) (suggest skipping Ch 5 "Macros" for now)
  - [Clojure for the Brave and True](https://www.braveclojure.com/clojure-for-the-brave-and-true/) (suggest skipping ch11 on core.async, ch7 section on Macros, and ch8 on Macros)
- Problems and Exercises
  - [4Clojure](http://www.4clojure.com/) problems are broken down by difficulty (Elementary, Easy, Medium and Hard). However, you might find it more useful to complete problems that match what you're reading. For example, if you've just read Chapter 4 of Clojure from the Ground Up (Sequences), give the problems that are tagged "seqs" a shot.
  - [Exercism](https://exercism.io/tracks/clojure) is a good bonus, especially if you can get a mentor to review your code.
- ClojureScript, Reagent, Re-frame
  - [Intro to ClojureScript](https://clojurescript.org/guides/quick-start). ClojureScript is essentially the same as Clojure, with the exception being that your language is JavaScript and not Java. You have access to JavaScript libraries, your ClojureScript code compiles to JS. Because you are no longer using Clojure, you lose threading and concurrency.
  - [Intro to Reagent](https://reagent-project.github.io/). Pre-requisite: Atoms, covered by Chapter 6 of Clojure from the Ground Up
  - [Reagent Docs](https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/documentation-index). Pre-requisite: Atoms
  - re-frame vs react-redux: re-frame is the frontend framework Athens uses, which overlaps heavily with redux. It's not a pure 1:1 mapping – Re-frame introduces a few new concepts such as `fx` and `cofx` – but it's quite close!
  
        | re-frame     | react-redux        |
        | ------------ | ------------------ |
        | events       | actions/reducer    |
        | db           | store              |
        | subscribe    | mapStateToProps    |
        | dispatch     | mapDispatchToProps |
        | subs         |                    |
        | fx           |                    |
        | cofx         |                    |
        
  - [re-frame tutorial by PurelyFunctional.tv](https://purelyfunctional.tv/guide/re-frame--building-blocks/) – primer on re-frame, hiccup, and reagent
  - [re-frame's documentation's about the data loop](https://day8.github.io/re-frame/a-loop/)
  - [re-frame examples](https://github.com/day8/re-frame/tree/master/examples) and [re-frame-10x TodoMVC](https://github.com/day8/re-frame-10x/tree/master/examples/todomvc). Clone and actually modify these apps!
  - Real-world projects: [conduit](https://github.com/jacekschae/conduit), [status.im](https://github.com/status-im/status-react), [Blue Genes](https://github.com/intermine/bluegenes)
  - Build something of your own! Pomodoro timer, calculator, etc. Projects from previous learners: [Pomato](https://github.com/itsrainingmani/pomato) & [Hail-the-wheel](https://github.com/alaq/hail-the-wheel).
- cljs-devtools
  - Even though we are compiling from ClojureScript to JavaScript, we can still leverage the awesomeness of Chrome DevTools! (Sorry Firefox people, it doesn't work as well.) You can set breakpoints _in_ ClojureScript from the source tab and jump to code where errors have been thrown, just like in JavaScript! But also, you can print ClojureScript data. [Check it out](https://github.com/binaryage/cljs-devtools).
  - cljs-devtools, re-frame-10x, and the REPL will be invaluable not just for debugging your program, but also for interacting with, tinkering with, and reasoning about your program while you code.
- DataScript: DataScript is a database engine for the frontend. It is a port of an actual backend database, Datomic. The query language DataScript and Datomic are written is Datalog. Like SQL, DataLog is a declarative, logical programming language. Unlike SQL, it leverages set-logic, which makes for very flexible queries such as recursive queries and reverse lookups. Similarly, DataScript and Datomic are very flexible engines with flexible schemas. All of this plays into the graph database that Roam/Athens is built off of. Indeed, it may be the secret sauce of this whole thing!
  - [Datascript and Datomic: Data Modeling for Heroes - Mark Bastian](https://www.youtube.com/watch?v=tV4pHW_WOrY)
  - [clojureD 2019: "How to Graph Your Data" by Paula Gearon](https://www.youtube.com/watch?v=tbVwmFBnfo4)
  - [http://www.learndatalogtoday.org/](http://www.learndatalogtoday.org/): a series of exercises to familiarize you with   DataLog syntax and common operations, nothing crazy. It doesn't provide a ton of background, however, so you may want to   reference the latter resources.
  - [https://github.com/markbastian/datascript-playground/](https://github.com/markbastian/datascript-playground/): Similar to   the TodoMVC apps, you should download #2 and evaluate each expression in the REPL as you go through the code. There are a   lot of examples, just pick a few.
  - Datomic docs are the reference that DataScript is based off of. There are a lot. These are the best ones to start off with, and the ones docs that apply to DataScript
    - [https://docs.datomic.com/on-prem/pull.html](https://docs.datomic.com/on-prem/pull.html)
    - [https://docs.datomic.com/on-prem/query.html](https://docs.datomic.com/on-prem/query.html)
    - [https://docs.datomic.com/on-prem/schema.html](https://docs.datomic.com/on-prem/schema.html)
    - [https://docs.datomic.com/on-prem/transactions.html](https://docs.datomic.com/on-prem/transactions.html)
- Clojure History and Motivation
    - [Effective Programs - 10 Years of Clojure - Rich Hickey](https://www.youtube.com/watch?v=2V1FtfBDsLU)
    - ["History of Clojure" paper, History of Programming Languages Conference - Rich Hickey](https://download.clojure.org/papers/clojure-hopl-iv-final.pdf)
- Paid Tutorial/Courses
  - [Clojure by Example](https://github.com/inclojure-org/clojure-by-example) (not for absolute beginner programmers)
  - [Getting Clojure](https://pragprog.com/titles/roclojure/) (not a free resource, but highly recommended by the community)
- Cheatsheets: Clojure has an extensive core library and many symbols not often found in mainstream languages.
    - [Clojure Cheatsheet](https://clojure.org/api/cheatsheet)
    - [ClojureScript Cheatsheet](https://cljs.info/cheatsheet/)
    - [ClojureDocs Quick Reference](http://clojuredocs.org/quickref)
- Questions: How well do you grok Clojure? That is, do you intuit the design principles and philosophy that Clojure embodies? Some of these questions may even make a Clojure sensei pause and think. Ultimately, there isn't one right answer. And as Socrates taught us, sometimes just sitting with the questions is good enough. 🙂
    - Why are there so many **core functions** in clojure.core? What affordances does this give the programmer?
    - What is a **persistent data structure**? What affordances does they give the programmer?
    - Why is **concurrency** harder in some languages than others?
    - Why is Clojure a **Lisp**? What affordances do Lisps give to programmers?
    - What affordances does Clojure's **REPL** give to the programmer?
    - Why is Clojure a **hosted language**? What affordances does this give the programmer?
    - What is **lazy evaluation**? What are **lazy sequences**? Why might laziness be useful?
    - Where do you see the principle of **accretion** at play in the Clojure world?
- Bonus Questions
    - Why do Clojurians worship Rich Hickey?
    - Who are your favorite Clojurians?
</details>

# Social Accountability

MOOCs have a high dropout rate, somewhere between 80-95% ([1](https://keg.cs.tsinghua.edu.cn/jietang/publications/AAAI19-Feng-dropout-moocs.pdf), [2](https://warwick.ac.uk/fac/sci/dcs/people/research/csrmaj/daniel_onah_edulearn14.pdf), [3](https://www.wired.com/insights/2014/08/whats-wrong-moocs-arent-changing-game-education/)).

Learning is hard, and even harder without support. But you're in luck! Many people want to learn Clojure too. What's more, Athens has a welcoming, warm community, with [Learning and Collaboration](https://github.com/athensresearch/athens/blob/master/CODE_OF_CONDUCT.md#values) as our founding values.

- Create an issue for yourself on our [project board](https://github.com/athensresearch/ClojureFam/projects/3). When enough people join the board, we will kick off the group on Discord.
- Learn in Public! Tweet, blog, or simply post in the [`#learn-in-public`](https://discord.gg/7ztV74d) channel each day you learn Clojure.
- Hold your teammates accountable! Start a group chat, [look at their checkboxes](https://github.com/athensresearch/ClojureFam/issues/53), and consider doing pair programming sessions.
- Learn in Public Examples:
    - [alaq](https://github.com/alaq/learning-clojure-in-public)
    - [itsrainingmani](https://github.com/itsrainingmani/learn-clojure-in-public)
    - [nthd3gr33](https://github.com/nthd3gr33/learn-clojure-in-public)
    - [ens100](https://github.com/ens100/Learning-Clojure)
    - [jsjoeio](https://joeprevite.com/clojure-from-the-ground-up)

# Mentorships and Office Hours

Firstly, the broader Clojure community is extremely approachable. It's part of why we all love the language itself. I (Jeff) have never been stuck on an implementation problem for more than a day. Each time I did get stuck, I floated a question to the Clojurians Slack, and quickly got unstuck.

For those questions that go deeper or broader, it can help having synchronous communication. If you and your team have these kinds of questions, or have lots of interrelated questions, use our Discord to organize office hours with a mentor.

Keep in mind that the availability of office hours is largely dependent on mentors, who are all doing this voluntarily. Try to ask them tough questions that can't be easily Googled!

As an aside, previous iterations of ClojureFam had fewer learners and more mentors. What we found is that this isn't scalable for mentors, and learners still dropped out, leaving their teammates alone. This is why we have less dedicated mentors and larger peer groups.

