## - Add local files

```
echo hello world! > a.txt
echo hello world! > b.txt
echo hello world! > b.txt
```

Make 3 files in a folder

```
> git status
현재 브랜치 main
브랜치가 'origin/main'에 맞게 업데이트된 상태입니다.

커밋할 변경 사항:
  (use "git restore --staged <file>..." to unstage)
	새 파일:       ../Git Syntax.md

커밋하도록 정하지 않은 변경 사항:
  (무엇을 커밋할지 바꾸려면 "git add/rm <파일>..."을 사용하십시오)
  (use "git restore <file>..." to discard changes in working directory)
	삭제함:        ../Git Syntax.md

추적하지 않는 파일:
  (커밋할 사항에 포함하려면 "git add <파일>..."을 사용하십시오)
	../git-practice.md
	./
```

`git add ` a.txt

Move to a file to staging area

<img width="463" alt="1" src="https://user-images.githubusercontent.com/84453688/149659315-228032b4-18ff-4fa2-b6b0-e89ada4e74bf.png">

`git add ` \*.txt

move all .txt file to staging area

<img width="529" alt="2" src="https://user-images.githubusercontent.com/84453688/149659326-5000c91a-271a-4a83-ac1b-6af6f24c50e7.png">


`echo Jae >> a.txt`

```
> git status
현재 브랜치 main
브랜치가 'origin/main'에 맞게 업데이트된 상태입니다.

커밋할 변경 사항:
  (use "git restore --staged <file>..." to unstage)
	새 파일:       a.txt

커밋하도록 정하지 않은 변경 사항:
  (무엇을 커밋할지 바꾸려면 "git add <파일>..."을 사용하십시오)
  (use "git restore <file>..." to discard changes in working directory)
	수정함:        a.txt

추적하지 않는 파일:
  (커밋할 사항에 포함하려면 "git add <파일>..."을 사용하십시오)
	b.txt
	c.txt
```

```
git rm --cached *
rm 'git/git-practice/a.txt'
rm 'git/git-practice/b.txt'
rm 'git/git-practice/c.txt'
```

You can remove all files from staging area to working directory

`git add *`

Stages everything, but not files that begin with a dot & does not remove files that have been deleted from the disk

`git add .`

Stages everything, but does not remove files that have been deleted from the disk

## - git status

<img width="515" alt="3" src="https://user-images.githubusercontent.com/84453688/149659332-050b8480-6aad-49a9-8d1f-f5a17eeabe83.png">

## - Compare files (git diff)

```
> git diff
diff --git a/git/git-practice/a.txt b/git/git-practice/a.txt
index f7bc79c..b927a0c 100644
--- a/git/git-practice/a.txt
+++ b/git/git-practice/a.txt
@@ -1,2 +1,3 @@
 hello world!
 Jae
+something
(END)
```

`git diff --staged` = `git diff --cached`

See difference all files in staging area.

```
> git diff --staged
diff --git a/git/git-practice/a.txt b/git/git-practice/a.txt
new file mode 100644
index 0000000..f7bc79c
--- /dev/null
+++ b/git/git-practice/a.txt
@@ -0,0 +1,2 @@
+hello world!
+Jae
diff --git a/git/git-practice/b.txt b/git/git-practice/b.txt
new file mode 100644
index 0000000..a042389
--- /dev/null
+++ b/git/git-practice/b.txt
@@ -0,0 +1 @@
+hello world!
diff --git a/git/git-practice/c.txt b/git/git-practice/c.txt
new file mode 100644
index 0000000..a042389
--- /dev/null
+++ b/git/git-practice/c.txt
@@ -0,0 +1 @@
+hello world!
(END)
```
