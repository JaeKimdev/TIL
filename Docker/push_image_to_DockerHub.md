![스크린샷 2022-03-17 오후 9 11 49](https://user-images.githubusercontent.com/84453688/158815653-69a4461d-7c23-417e-81c8-0b2d7bfb54d6.png)

## Make repository

<img width="1247" alt="스크린샷 2022-03-17 오후 9 15 38" src="https://user-images.githubusercontent.com/84453688/158816348-92112b38-d822-4050-b7c7-93ed2d0665a2.png">

`$ docker run -it --name my-python ubuntu`

## update & install python

`$ apt update && apt install -y python3`

## Commit

`$ docker commit my-python mene79/python3:1.0`

<img width="645" alt="스크린샷 2022-03-17 오후 9 23 15" src="https://user-images.githubusercontent.com/84453688/158817724-c27a7fcc-6f34-4694-8dc4-c95aea384b8b.png">

`$ docker login`

<img width="794" alt="스크린샷 2022-03-17 오후 9 24 36" src="https://user-images.githubusercontent.com/84453688/158817952-cdcef318-2be4-4611-bb99-9804da68bb5b.png">

## push image

`$ docker push mene79/python3:1.0`

<img width="678" alt="스크린샷 2022-03-17 오후 9 26 54" src="https://user-images.githubusercontent.com/84453688/158818390-9d9160ec-c189-45fd-8594-4a00a6fe4118.png">

<img width="1236" alt="스크린샷 2022-03-17 오후 9 27 49" src="https://user-images.githubusercontent.com/84453688/158818568-9095d78e-5605-42d7-9def-857c1edccf82.png">

## Delete image
 
`$ docker rmi --force mene79/python3:1.0`

<img width="691" alt="스크린샷 2022-03-17 오후 9 29 27" src="https://user-images.githubusercontent.com/84453688/158818866-13f81a1a-fe4b-4bf0-b782-a81c4f2c668c.png">

## And pull image from docker hub

`$ docker pull mene79/python3:1.0`

<img width="582" alt="스크린샷 2022-03-17 오후 9 33 15" src="https://user-images.githubusercontent.com/84453688/158819510-95383476-c2ee-4cf8-83b5-f24264ade1ee.png">

<img width="490" alt="스크린샷 2022-03-17 오후 9 33 45" src="https://user-images.githubusercontent.com/84453688/158819598-49e43fc1-9a14-4662-910d-2018627776a6.png">

