<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">Photo Editor</h3>
<p align="center"><strong><code>@capawesome/capacitor-photo-editor</code></strong></p>
<p align="center">
  Capacitor plugin that allows the user to edit a photo. 
</p>

<p align="center">
  <img src="https://img.shields.io/maintenance/yes/2022?style=flat-square" />
  <a href="https://github.com/capawesome-team/capacitor-photo-editor/actions?query=workflow%3A%22CI%22"><img src="https://img.shields.io/github/workflow/status/capawesome-team/capacitor-photo-editor/CI/main?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@capawesome/capacitor-photo-editor"><img src="https://img.shields.io/npm/l/@capawesome/capacitor-photo-editor?style=flat-square" /></a>
<br>
  <a href="https://www.npmjs.com/package/@capawesome/capacitor-photo-editor"><img src="https://img.shields.io/npm/dw/@capawesome/capacitor-photo-editor?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@capawesome/capacitor-photo-editor"><img src="https://img.shields.io/npm/v/@capawesome/capacitor-photo-editor?style=flat-square" /></a>
  <a href="https://github.com/capawesome-team"><img src="https://img.shields.io/badge/part%20of-capawesome-%234f46e5?style=flat-square" /></a>
</p>

## Maintainers

| Maintainer | GitHub                                    | Social                                        |
| ---------- | ----------------------------------------- | --------------------------------------------- |
| Robin Genz | [robingenz](https://github.com/robingenz) | [@robin_genz](https://twitter.com/robin_genz) |

## Sponsors

This is an MIT-licensed open source project. 
It can grow thanks to the support by these awesome people. 
If you'd like to join them, please read more [here](https://github.com/sponsors/capawesome-team).  

<!-- sponsors --><!-- sponsors -->

## Installation

```bash
npm install @capawesome/capacitor-photo-editor
npx cap sync
```

## Configuration

No configuration required for this plugin.

## Demo

A working example can be found here: [robingenz/capacitor-plugin-demo](https://github.com/robingenz/capacitor-plugin-demo)

## Usage

```typescript
import { PhotoEditor } from '@capawesome/capacitor-photo-editor';

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

See [CHANGELOG.md](https://github.com/capawesome-team/capacitor-photo-editor/blob/main/CHANGELOG.md).

## License

See [LICENSE](https://github.com/capawesome-team/capacitor-photo-editor/blob/main/LICENSE).
