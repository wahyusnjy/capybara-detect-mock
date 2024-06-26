export interface DetectMockyPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
