# Make few Repos into one (Subtree)
#### - 여러개의 Repository들을 하나의 Repository로 만드는 방법<br>

- I made several repository for study differenrt languages.<br>
(ex> Python-practice, git, Front-end-practice, algorithm...)<br>

I combined projects with similar characteristics to make it a repertoire


    git subtree add --prefix=[하위로 둘 폴더명] [기존 프로젝트 git 주소] [현재 레포지토리의 git branch]

<br>

>Repeat the process several times for the combined repertoires and execute the git push command at the end.<br>
합칠 레포지토리들에 대해 여러번의 과정을 반복해주시고 마지막에 git push 명령어를 실행합니다.

>You can see that the repositories have been merged into one repository along with the existing commit histories.<br>
기존의 commit history들과 함께 레포지토리들이 하나의 레포지토리에 병합된 것을 확인할 수 있습니다.



<br>
<img width="564" alt="스크린샷 2022-01-12 오후 4 13 11" src="https://user-images.githubusercontent.com/84453688/149088928-a56b3840-e76b-4073-85ed-bf7881195e67.png">


Ref : https://www.atlassian.com/git/tutorials/git-subtree

