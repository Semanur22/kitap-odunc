# This is a fork of patw0929/react-int-phone-input-accessibility made accessible country list navigation with screen reader and keyboard 

## Demo & Examples

To build the examples locally, run:

```bash
npm install
npm start
```

or

```bash
yarn
yarn start
```

Then open [`localhost:3000`](http://localhost:4000) in a browser.


## Installation

The easiest way to use react-int-phone-input-accessibility is to install it from NPM and include it in your own React build process (using [Webpack](http://webpack.github.io/), etc).

```bash
npm install react-int-phone-input-accessibility --save
```

or

```bash
yarn add react-int-phone-input-accessibility
```


## Usage

```javascript
import IntlTelInput from 'react-int-phone-input-accessibility';
import 'react-int-phone-input-accessibility/dist/main.css';

<IntlTelInput
  containerClassName="intl-tel-input"
  inputClassName="form-control"
/>
```

## Development (`src` and the build process)

**NOTE:** The source code for the component is in `src`. A UMD bundle is also built to `dist`, which can be included without the need for any build system.

To build, watch and serve the examples (which will also watch the component source), run `npm start`.

If you want to build to the bundle file to `dist/` folder, please run:

```bash
npm run build
```

or

```bash
yarn run build
```

## Contributing

To contribute to react-int-phone-input-accessibility, clone this repo locally and commit your code on a separate branch. Please write tests for your code, and run the linter before opening a pull-request:

```bash
npm test
npm run lint
```

or

```bash
yarn test
yarn run lint
```

## License

MIT

Copyright (c) 2015-2019 patw.

