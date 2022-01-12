Awesome tools VSCode has for source control

- `Source Control (Ctrl+Shift+G G)`

Green and blue things: Git things

- They tell you that you added something
- Blue: means modified
- Green: means added

`M`: means the file is modified
`U`: stands for untracked

- Git is not yet looking at it.
- b/c we have to commit it

By default, `SOURCE CONTROL` menu on VSCode will just give us the changes on the working area.

- If you click `+`, there is a bar `Staged Changes`.
  -- These are the ones that you're going to commit.

How we get our commit history of files:

    $ git log

- `HEAD -> main`: HEAD master is your computer
- `origin/main`: origin is your GitHub repo up there on the cloud

      $ git push origin main

- On the console, it's going to upload.

      $ git log

=> Type "q"

    $ git add chapter_two.txt

- Adds `chapter_two.txt` to the staging area

Sometimes you want to add all the files:

    $ git add .

- `.` means this directory. (All the files in this directory)

      $ git commit -m "Commit message"

      $ git commit --help
