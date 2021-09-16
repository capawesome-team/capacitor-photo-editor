export interface PhotoEditorPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
