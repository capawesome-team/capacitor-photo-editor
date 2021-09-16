import { WebPlugin } from '@capacitor/core';

import type { PhotoEditorPlugin } from './definitions';

export class PhotoEditorWeb extends WebPlugin implements PhotoEditorPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
