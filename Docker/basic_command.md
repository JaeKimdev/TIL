## What is Docker?

In short, docker is a container-based open-source virtualization platform that enables various programs and execution environments in a server environment to run in an isolated environment called a container.

This allows you to easily manage complex server environments with code and configure a stable distribution environment (such as uninterrupted distribution).

## Install Docker

- Linux automatic installation script.

```
$ sudo wget -qO- https://get.docker.com/ | sh

$ curl -fsSL https://get.docker.com -o get-docker.sh
$ sh get-docker.sh
```

- Ubuntu

```
$ sudo apt-get update
$ sudo apt-get install docker.io
$ sudo ln -sf /usr/bin/docker.io /usr/local/bin/docker
```

- Windows, Mac

install 'Docker for Windows', 'Docker for mac'

## Docker Image

In the docker, a container can be created using a docker image.

The docker image allows you to apply the configuration environment of the container as set in the image.

### Show image list

```
$ sudo docker images
```
<img width="427" alt="docker1" src="https://user-images.githubusercontent.com/84453688/154628729-a1eb87fe-e335-4312-8ec0-97ded58f37e0.png">

### Image Search

```
$ sudo docker search [image name]
```

### Download Image

```
$ sudo docker pull [Image name]:[version]
```

If you put version: `latest`, you can download recent one.

### Remove Image

```
$ sudo docker rmi [Imgae id]
```
When deleting an image before deleting a container, the container can also be forcibly deleted if the `-f` option is attached.

```
$ sudo docker rmi -f [Image id]
```

## Show Container list

```
$ sudo docker ps
```

(Option) Show all containers -a

```
$ sudo docker ps -a
```
<img width="584" alt="docker3" src="https://user-images.githubusercontent.com/84453688/154629809-51076031-9b0d-4684-96d8-cab640077c6c.png">

## Run Container

```
$ sudo docker run [options] image[:TAG|@DIGEST] [COMMAND] [ARG...]

// ex> $ sudo docker run --name ws2 httpd
```

You can also use GUI in Docer App

![docker4](https://user-images.githubusercontent.com/84453688/154630471-a045de94-9c73-45ca-8f2e-de6c307a4546.gif)

## Start Container

```
$ sudo docker start [Container id or name]
```

## Restart Container

```
$ sudo docker restart [Container id or name]
```

## Connect Container

```
$ sudo docker attach [Container id or name]
```

## Stop Container

```
$ sudo docker stop [Container id or name]
```

## Remove Container

```
$ sudo docker rm [Container id or name]

// Remove all containers
$ sudo docker rm `docker ps -a -q`
```

## Command without `sudo`

```
$ sudo usermod -aG docker $USER
//Give permission to the user who is currently accessing user. 현재 접속중인 사용자에게 권한주기

$ sudo usermod -aG docker your-user
//Give permission to your-user, your-user 사용자에게 권한주기
```
