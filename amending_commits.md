To delete a branch:

    $ git branch -d

What happens when you forget a file and you want to add a file to your commit

-> Amend a commit:
- Taking your latest commit and modifying it

Change the message of your commit

    $ git commit --amend -m "message"

- If you don't want to edit the message

      $ git commit --amend --no-edit

To see what's going:

    $ git status

- Red: It's not staged for commit.
- Green: It's on the staged area.

Thing that allows you to hide files:

Create a file called `.gitignore`

    $ touch .gitignore

=> Add all the files and folders that you don't want to add to Git
