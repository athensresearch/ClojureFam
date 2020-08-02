# DataScript

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
