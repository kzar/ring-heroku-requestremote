# `ring-heroku-requestremote`

[Ring](http://github.com/mmcgrana/ring) middleware that puts fixes the request remote-ip for Heroku.

### Usage

#### With Noir - in server.clj
      (use '[ring.middleware.heroku-requestremote])
      (server/add-middleware wrap-heroku-requestremote)

## License

Copyright (C) 2011 Dave Barker

Code distributed under the Eclipse Public License, the same as Clojure.

