# API仕様（サンプル）

## GET /api/items

アイテム一覧を取得する。

| パラメータ | 型 | 必須 | 説明 |
|---|---|---|---|
| `page` | number | - | ページ番号 (デフォルト 1) |
| `limit` | number | - | 1ページあたりの件数 (デフォルト 20) |

### レスポンス例

```json
{
  "items": [
    { "id": 1, "name": "サンプルアイテム" }
  ],
  "total": 1
}
```

## POST /api/items

アイテムを作成する。

> 認証必須。`Authorization: Bearer <token>` ヘッダーを付与すること。
