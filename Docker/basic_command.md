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

