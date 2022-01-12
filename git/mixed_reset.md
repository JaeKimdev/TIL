    $ git reset HEAD^

- Not a soft or hard reset
- Does a mixed reset
  -> The file becomes untracked again.
  -- It moves all the files from the previous commit to the unstaged area (to the working directory).
  -- You took the changes back but you kept the file.

Hard reset

    $ git reset HEAD^ --hard

- Kills everything and goes back to that file
- You take the changes back but you don't keep the file as you created it.

Problem: We have a different end in our remote and local repos (Out of sync).

    $ git remote -v

=> If you pull from main, you get a conflict.

Fix merge conflicts => $ git add . => Commit again => $ git pull origin master
--> When you do a reset, you do $ git push origin master --force
-- If you made a mistake in your desktop and you took it back, there's no need to merge the solution to that mistake with the mistake that you had on GitHub and solve the conflict.

Duplicated commits

Soft reset

    $ git reset HEAD^ --soft
