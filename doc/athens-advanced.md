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
