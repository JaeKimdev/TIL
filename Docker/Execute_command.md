## Execute command

<img width="1259" alt="1" src="https://user-images.githubusercontent.com/84453688/154836293-4dedf7a3-ab5d-422b-9c63-b16a641b24a4.png">

<img width="651" alt="2" src="https://user-images.githubusercontent.com/84453688/154836375-eeb0f8b9-672a-42fc-b619-83113f8e0a53.png">

You can command docker in terminal

<img width="771" alt="3" src="https://user-images.githubusercontent.com/84453688/154836490-5af30dd9-4339-4931-8d87-9803ff16ef2e.png">

Use the `-it` option to continue connecting with the container.

<img width="501" alt="4" src="https://user-images.githubusercontent.com/84453688/154836647-ef97faeb-3c61-4e10-aeeb-bebd8747188f.png">

After entering the `exit` command, use the terminal for the host.

<img width="489" alt="5" src="https://user-images.githubusercontent.com/84453688/154836843-d704f9d8-0edf-4c0f-8833-96198463f775.png">

For change `index.html` connect ws3 container and move to directory

use nano editor

<img width="503" alt="6" src="https://user-images.githubusercontent.com/84453688/154836930-4ed5fdfc-11e4-4357-9846-7e27d8e7ae3c.png">

change html file, and press `Ctrn + X` to exit then press `Y`, and press `enter`

<img width="351" alt="7" src="https://user-images.githubusercontent.com/84453688/154836989-2ff1c547-ebc3-4fe7-951e-682b427eca89.png">

## Connecting the host to the container's file system

<img width="697" alt="8" src="https://user-images.githubusercontent.com/84453688/154837075-2e5a33ec-4fa1-4e5b-9e6f-97e491aa388f.png">

<img width="1401" alt="9" src="https://user-images.githubusercontent.com/84453688/154837335-5f9ffedf-ae58-4790-943e-abfbb6d4e881.png">

`docker run -p 8888:80 -v ~/Desktop/htdocs:/usr/local/apache2/htdocs/ httpd`


