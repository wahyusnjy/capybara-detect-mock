import { WebPlugin } from '@capacitor/core';

import type { DetectMockyPlugin } from './definitions';

export class DetectMockyWeb extends WebPlugin implements DetectMockyPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
