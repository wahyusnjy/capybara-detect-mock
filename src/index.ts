import { registerPlugin } from '@capacitor/core';

import type { DetectMockyPlugin } from './definitions';

const DetectMocky = registerPlugin<DetectMockyPlugin>('DetectMocky', {
  web: () => import('./web').then(m => new m.DetectMockyWeb()),
});

export * from './definitions';
export { DetectMocky };
