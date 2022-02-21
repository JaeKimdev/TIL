<img width="1065" alt="1" src="https://user-images.githubusercontent.com/84453688/154965296-5f4a41c7-6ff9-43a8-91c3-bebc9610b557.png">

## Scenario

<img width="856" alt="2" src="https://user-images.githubusercontent.com/84453688/154965820-88f86f79-e108-4da0-a98c-76d278d50651.png">

`$ docker pull ubuntu`

<img width="593" alt="3" src="https://user-images.githubusercontent.com/84453688/154966540-a34cd4e7-6800-4172-ab86-d370e86fe69c.png">

`$ docker run -it --name my-ubuntu2 ubuntu bash`

```
$ apt update
$ apt install git
$ exit
```

### Make another container

`$ docker run -it --name my-ubuntu2 ubuntu bash`

my-ubuntu2 coainer have not git.
so, take my-ubuntu container to commit.

`$ docker commit my-ubuntu mene79:ubuntu-git`

<img width="520" alt="4" src="https://user-images.githubusercontent.com/84453688/154968642-cb7f3519-6a4d-48d3-8a37-40bd339fc178.png">

take commited image then, make another container

```
$ docker run -it --name nodejs mene79:ubuntu-git bash
apt update && apt install nodejs
```


```
$ docker run -it --name python mene79:ubuntu-git bash
apt update && apt install python
```
