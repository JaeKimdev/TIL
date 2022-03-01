<img width="911" alt="1" src="https://user-images.githubusercontent.com/84453688/156170799-78be02f1-96b8-46b4-855b-a6e86d5a921d.png">

<img width="542" alt="2" src="https://user-images.githubusercontent.com/84453688/156173156-79078ddd-65bd-4d83-8e3b-f45fa17875f1.png">

### Tag

`git tag Jae`

<img width="616" alt="3" src="https://user-images.githubusercontent.com/84453688/156173443-b955b7d7-79b8-49fe-94e1-93e49e19b0a2.png">

we can check tag `git log` screen, too

If you want to tag a specific commit, copy hash code then

`git tag v1.0.0 0ad2dbb`

<img width="609" alt="5" src="https://user-images.githubusercontent.com/84453688/156174054-bc6bd1e8-5a36-4e9e-b20c-e6780da8ad71.png">

`git tag v2.0.0 b8e485f`

<img width="613" alt="6" src="https://user-images.githubusercontent.com/84453688/156174333-ca691f0b-cab0-42d9-bb76-375ddc082954.png">

We can put more information ex> 'Release information'

`git tag v1.0.1 328708d -am "Realese note.."`

<img width="608" alt="7" src="https://user-images.githubusercontent.com/84453688/156174996-ed85fc7a-2d67-440d-b1b8-76cc22d165df.png">

But, we cannot see that imformation. we need to use `show` command

`git show v1.0.1`

<img width="461" alt="8" src="https://user-images.githubusercontent.com/84453688/156175257-696aeacf-aecf-43ed-93c7-cc2cdebe3a69.png">

### Check all tag

`git tag`

<img width="459" alt="9" src="https://user-images.githubusercontent.com/84453688/156175512-044adaaf-4121-489d-b810-0edcf27efbbf.png">

also can use wildcard, `git tag -l "v1.0.*"` or `git tag -l "v2*"`

### Delete tag

`git tag -d v1.0.1`

<img width="334" alt="10" src="https://user-images.githubusercontent.com/84453688/156176332-4a6b84d7-0848-430b-b8c6-10d96a834a20.png">

<img width="611" alt="11" src="https://user-images.githubusercontent.com/84453688/156176432-1bb6dc4a-f480-4608-b1cc-3559ccada528.png">

### Move to tag

`git checkout v2.0.0`

<img width="558" alt="12" src="https://user-images.githubusercontent.com/84453688/156176679-162a2434-69ff-41a8-9287-221c45ee95e3.png">

We can make branch with tag

`git checkout -b NewBranch v2.0.0`

### Sync with server

`git push orrigin v1.0.0` - specipic tag

`git push origin --tags` - All tags

`git push origin --delete v1.0.0` delete tag



