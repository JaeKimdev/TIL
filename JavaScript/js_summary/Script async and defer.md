## Differences between Script `async` and `defer`

In general, when referring to js, parsing one line at a time to convert to a DOM element.
When you find a `strip` tag, you download it from the server (latency occurs).

일반적으로 js를 참조하게 되면 한줄씩 parsing하여 DOM 요소로 변환함.
스크립트 태그를 발견하면, 서버에서 해당 파일을 다운로드 받게 됨(latency가 발생).

### Default reference

```js
<head> or <body>
<script  src="test.js"></script>
</head> or </body>
```

- If referenced in this way, you will have to wait to fetch js. (Inefficient)
- 이러한 방식으로 참조하게 되면 js를 fetching 하는것을 기다려야 함. (비효율적)

### head + async reference

```js
<head>
  <script asyn src="test.js"></script>
</head>
```

- The browser causes the js download to be performed in parallel in the process of parsing and continues parsing.
  > 브라우저가 parsing의 과정에서 js 다운로드를 병렬로 수행하게 하고 parsing을 지속함.
- How to stop parsing again and refer to it when the js download performed in parallel is complete

  > 병렬로 수행된 js 다운로드가 완료되면 parsing을 다시 멈추고 참조하는 방식

- If you are downloading multiple js files, they are referenced in the order in which they were downloaded first

  > 여러개의 js 파일을 다운로드 하는 경우에는 먼저 다운로드가 끝난 순서대로 참조됨

- Benefits: Save time to download
- Disadvantages: functionality may not work because html runs before js is downloaded
  > 장점: 다운로드 받는 시간 절약
  > 단점: html이 js가 다운로드 되기 전에 실행되기 때문에 기능이 동작하지 않을 수 있음

### head + defer reference

```js
<head>
  <script defer src="test.js"></script>
</head>
```

- The browser causes the js download to be performed in parallel in the process of parsing and continues parsing.
- Execute downloaded js file after parsing ends
- If you are downloading multiple js files, refer to them in the order defined by the developer

> - 브라우저가 parsing의 과정에서 js 다운로드를 병렬로 수행하게 하고 parshing을 지속함.
> - parsing이 끝난 이후, 다운로드된 js 파일을 실행함
> - 여러개의 js 파일을 다운로드 하는 경우에는 개발자가 정의한 순서대로 참조

## `'use strict'` [Strict mode - MDN site](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode)

JavaScript is very flexible.
strict mode added ECMAScript 5.
It shows error when using undeclared variables

```js
a = 6; //we can use it without strict mode
```

In strict mode, you have to declare variables.

```js
"use strict";
let a;
a = 6;
```

The JavaScript engine can analyze scripts a little faster, so it can work efficiently.
