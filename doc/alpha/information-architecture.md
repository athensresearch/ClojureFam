Initial thoughts:

1. Use this repository as a monorepo for curation
    1. Expect to integrate with Athens itself over time
2. This repository doubles as a REPL playground and a documentation hub.
   Toplevel `/src` for Clojure, `/doc` for learning resources.
3. Intended usage: Spin up a REPL here, and have a full-blown Clojure/Athens
   learning environment at your fingertips
4. For writing Koans and such: curate Koans relevant to Athens. How should they
   be used? Option: write tests that help you validate your understanding.
   Ensure that those tests can be run simply in the REPL. Learners / teams can
   then fork this repository, and work forward.
5. Use `/doc/alpha` and `/src/alpha` for work in progress (building to learn by
   learning to build, working with the garage door open). Lets us work directly
   on master. Resembles the Clojure Core team's strategy for Clojure Spec
   development: clojure.spec.alpha is released to the public for feedback
   (though, they use 2 _years_ for feedback and improvement, we want to move
   faster ...)
