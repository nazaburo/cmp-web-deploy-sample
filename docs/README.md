# CmpWebDeploySample 仕様書

このディレクトリの Markdown ファイルは [docsify](https://docsify.js.org/) でそのまま
GitHub Pages 上に仕様書サイトとして表示されます。ビルドステップは不要で、
`index.html`（docsifyの読み込み設定）以外はすべて `.md` ファイルです。

## 構成

```
docs/
├── index.html   ← docsifyの読み込み設定 (HTMLはこれだけ)
├── _sidebar.md  ← 左のナビゲーション
├── README.md    ← このページ
├── api.md
└── screens.md
```

ページを追加したいときは `.md` ファイルを置いて `_sidebar.md` にリンクを足すだけです。
