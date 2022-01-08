You need to be inside of the directory in your console to work with Git.

The last commit is the combination of all the other commits.

`HEAD`: Where the file is/At which point in time the file is

To go back in time (Modify `HEAD`):
$ git checkout {commit_id}

- You're just checking it out; you're not modifying the Git history

Go to the top again:
$ git checkout main

Reset: Dispose completely of a certain commit
$ git reset --hard HEAD^
-> `--hard`: Delete the commit
-> `HEAD^`: How far a head
-- `HEAD`: Current head
-- `HEAD^`: 1 commit back from head
-- `HEAD^^`: 2 commits back from head
-- `HEAD^^^`: 3 commits back from head

=> We have a problem: Our remote origin has a change that we don't want

- We need to do it by force
  $ git push origin main --force
  -> Forcefully updates what you did

Soft reset
$ git reset HEAD^
