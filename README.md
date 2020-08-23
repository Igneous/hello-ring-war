# hello-ring

Simple ring hello world app

## Build & Deploy

```
lein deps
lein ring uberwar test.war
sudo cp target/test.war /var/lib/tomcat9/webapps/ #(or whatever your war dir is)
#probably restart tomcat
```

## Usage

Visit http://tomcat.server.hostname:8080/test/ (or wherever port your tomcat install is configured to listen on)

## License
```
           DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
                   Version 2, December 2004
 
Copyright (C) 2020 Bucky Wolfe <bucky@usleep.consulting>

Everyone is permitted to copy and distribute verbatim or modified
copies of this license document, and changing it is allowed as long
as the name is changed.
 
           DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
  TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

 0. You just DO WHAT THE FUCK YOU WANT TO.
 ```
