<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">Photo Editor</h3>
<p align="center"><strong><code>@robingenz/capacitor-photo-editor</code></strong></p>
<p align="center">
  Capacitor plugin that allows the user to edit a photo. 
</p>

<p align="center">
  <img src="https://img.shields.io/maintenance/yes/2022?style=flat-square" />
  <a href="https://github.com/robingenz/capacitor-photo-editor/actions?query=workflow%3A%22CI%22"><img src="https://img.shields.io/github/workflow/status/robingenz/capacitor-photo-editor/CI/main?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@robingenz/capacitor-photo-editor"><img src="https://img.shields.io/npm/l/@robingenz/capacitor-photo-editor?style=flat-square" /></a>
<br>
  <a href="https://www.npmjs.com/package/@robingenz/capacitor-photo-editor"><img src="https://img.shields.io/npm/dw/@robingenz/capacitor-photo-editor?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@robingenz/capacitor-photo-editor"><img src="https://img.shields.io/npm/v/@robingenz/capacitor-photo-editor?style=flat-square" /></a>
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
<a href="#contributors-"><img src="https://img.shields.io/badge/all%20contributors-1-orange?style=flat-square" /></a>
<!-- ALL-CONTRIBUTORS-BADGE:END -->
</p>

## Maintainers

| Maintainer | GitHub                                    | Social                                        |
| ---------- | ----------------------------------------- | --------------------------------------------- |
| Robin Genz | [robingenz](https://github.com/robingenz) | [@robin_genz](https://twitter.com/robin_genz) |

## Installation

```bash
npm install @robingenz/capacitor-photo-editor
npx cap sync
```

## Configuration

No configuration required for this plugin.

## Demo

A working example can be found here: [robingenz/capacitor-plugin-demo](https://github.com/robingenz/capacitor-plugin-demo)

## Usage

```typescript
import { PhotoEditor } from '@robingenz/capacitor-photo-editor';

const editPhoto = async () => {
  await PhotoEditor.editPhoto({ path: 'data/image.png' });
};
```

## API

<docgen-index>

* [`editPhoto(...)`](#editphoto)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### editPhoto(...)

```typescript
editPhoto(options: EditPhotoOptions) => Promise<void>
```

Edit a photo at a given path.

Only available for Android.

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#editphotooptions">EditPhotoOptions</a></code> |

--------------------


### Interfaces


#### EditPhotoOptions

| Prop       | Type                | Description                   |
| ---------- | ------------------- | ----------------------------- |
| **`path`** | <code>string</code> | The path of the file to edit. |

</docgen-api>

## Changelog

See [CHANGELOG.md](https://github.com/robingenz/capacitor-photo-editor/blob/main/CHANGELOG.md).

## License

See [LICENSE](https://github.com/robingenz/capacitor-photo-editor/blob/main/LICENSE).
