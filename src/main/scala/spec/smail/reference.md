# Authentication
To login into the Mail Platform API, use following calls.

1. Send the username and base64 encoded password to the login resource with `POST` and receive the authentication tokens JSON.
2. Prepare your API call with `Authorization` header. The value
   field should be `MP session_token=<token>,timestamp=<timestamp>,signature=<sign>`.
3. Fire the calls

Remember that authentication tokens has _limited validity_. Once
your received unauthorized response, you need to `GET` new authentication
tokens.

## Unauthenticated access

If any request required auth but sent without `Authorization` header,
server will send an error response (see next section) with error code `1`.

# Error Response
Due to current limitation of swagger and common HTTP status code practice,
most user error *will* have a status code `400` (it's a bad request after
all).

However swagger 2.0 does not allow us to express disjoint type, therefore
we need to have workaround. All the `400` (may extended to other code)
returns with the following structure:

```json
{
  "error_code": 1234,
  "error": "a simple message",
  "error_detail": {
  }
}
```

This structure are common across all `400` response, however the content
of `error_detail` are subjected to `error_code` which should be defined as a
definition and one should write what code may occur for a resource in `400`
response description.

# Error Codes
| codes | description |
|-|-|
| 0 | Exceptional error, should not occur at all. |
| 1 | Unauthenticated. |
| 2 | License is not supporting current operation |
| 3 | Authentication fail. |
| 4 | Schedule job name exists |
| 5 | Invalid cron expression |
| 6 | Missing authentication token. |
| 7 | Malformed request content. |
| 8 | Insufficient permission. |
| 9 | Missing Parameter. |
| 10 | Invalid Parameter. |
| 11 | Schedule internal error. |
| 12 | Expired Credentials. |
| 13 | User needs to update their password upon their first log-in. |
| 1000 | Invalid account password. |
| 1001 | Account not found. |
| 1002 | Group not found. |
| 1003 | Domain not found. |
| 1004 | Role not found. |
| 1005 | Host not found. |
| 1006 | User store exception. |
| 1007 | Exceed licensed account quota. |
| 1008 | Password history violation. |
| 1009 | Exceed domain account quota. |
| 1010 | Attempt to remove last system administrator. |
| 1011 | domain alias from exists. |
| 1012 | Exceed licensed group quota. |
| 1013 | Exceed licensed domain quota. |
| 1014 | Exceed licensed archive quota. |
| 1015 | Exceed licensed host quota. |
| 1016 | Clean domain related archive resources failed. |
| 1017 | No active authentication sources exists. |
| 1018 | Clean group aliases failed. |
| 1019 | Domain schedule import rules exists, must be removed before domain deletion. |
| 1020 | Domain archive resource exists, must be removed before domain deletion. |
| 1021 | Domain user synchronization rules exists, must be removed before domain deletion. |
| 1022 | Domain authentication sources exists, must be removed before domain deletion. |
| 1023 | Domain contains user with system administrator role, must be removed before domain deletion. |
| 1024 | Attempt to remove system administrator role. |
| 1025 | Duplicate account name exists. |
| 1026 | Duplicate account email exists. |
| 1027 | Duplicate account id exists. |
| 1028 | Duplicate domain name exists. |
| 1029 | Duplicate domain id exists. |
| 1030 | Duplicate group id exists. |
| 1031 | Duplicate role id exists. |
| 1032 | Attempt to remove default user role. |
| 1033 | Invalid group permission, contains non-exist group or domain id |
| 1034 | Domain has been assigned as the default domain of one or more system import rules. |
| 1035 | The password doesn't meet the minimum length reuqired by the password principle of the domain. |
| 1036 | The password doesn't meet the maximum length reuqired by the password principle of the domain. |
| 1037 | The password doesn't meet the digit complexity reuqired by the password principle of the domain. |
| 1038 | The password doesn't meet the alphabet complexity reuqired by the password principle of the domain. |
| 1039 | The password doesn't meet the lowercase alphabet complexity reuqired by the password principle of the domain. |
| 1040 | The password doesn't meet the uppercase alphabet complexity reuqired by the password principle of the domain. |
| 1041 | The password doesn't meet the special character complexity reuqired by the password principle of the domain. |
| 1042 | Domain contains given host. |
| 1043 | Host not found in domain. |
| 1044 | Host exists. |
| 1045 | Host contains given email. |
| 1046 | There is no UI template for given role id. |
| 1047 | Domain archive policy exists, must be removed before domain deletion. |
| 3000 | No such auditor |
| 3001 | Auditee mail not found. |
| 5000 | Invalid preference format. |
| 5001 | Non modifiable resolution type. |
| 5002 | Preference not found. |
| 6000 | Invalid mailet/matcher configuration. |
| 6001 | Invalid filter request |
| 6002 | Unknown filter failure |
| 6003 | Filter not found |
| 6004 | Filter node not found |
| 6005 | Invalid filter as request parameter |
| 6006 | Invalid filter node configuration |
| 6007 | Invalid filter node position |
| 6008 | Merge conflict, there is changes after given revision for specified filter |
| 6009 | Commit data to disk fail |
| 6010 | Unknown revision ID |
| 6011 | Filter processor already locked |
| 6012 | There are unlocked filters in update request |
| 6013 | Filter store corrupted, unable to load data |
| 6014 | Unknown lock ID |
| 6015 | Lock ID does not match given processor ID |
| 6016 | Load mailet description error |
| 6017 | Filter processor is not empty |
| 7000 | Record not exist in mail repository |
| 7001 | Record exist in mail repository but was corrupted |
| 13000 | Quarantine mail not found. |
| 17000 | Search fail |
| 17001 | Invalid query |
| 17003 | Exceed max result window size |
| 18000 | Archive protocol not supported |
| 18001 | Invalid archive resource |
| 18002 | Archive resource not exists |
| 18003 | Archive domain not exists |
| 18004 | Archive policy not exists |
| 18005 | Remote archive failure |
| 18006 | Archive resource already mounted |
| 18007 | Archive policy still in progress |
| 18008 | Archive resource not mounted |
| 18009 | Free-space of archive resources below the minimum threshold |
| 18010 | Invalid resource manager response format |
| 18011 | Timeout waiting for resource manager response |
| 18012 | Invalid archive storage |
| 18013 | Archive resource entangled with policy, please remove all policy related with the resource |
| 18014 | Archive storage not mounted |
| 18015 | Archive storage already mounted |
| 18016 | Update or delete mounted archive resource is forbidden |
| 18017 | Invalid archive schedule setting |
| 18018 | Duplicate archive resource local path already exists |
| 18019 | Archive policy disabled |
| 18020 | Archive resource local path is a sub-directory of an existing archive resource, which is not allowed. |
| 18021 | Missing split archive storage |
| 18022 | Archive policy contains duplicate mail-type is not allowed. |
| 18023 | Archive function scope settings are incompatible with request. |
| 18024 | Create archive storage failed. |
| 18025 | Close archive storage failed. |
| 18026 | Store into archive storage failed. |
| 18027 | Cleanup archive failure failed. |
| 18028 | Read disk free space failed. |
| 18100 | Backup error |
| 18101 | Backup not found |
| 19000 | This system does not support set this value |
| 19001 | Error occurs when writing to configuration files. |
| 19002 | Unknown queue name |
| 19003 | Failed to set system function control scopes |
| 20001 | Version not found |
| 20002 | Connection error when server try to fetch version from update server |
| 20003 | Checksum of downloaded update does not match checksum in version list |
| 20004 | Installation is running for specified version |
| 20005 | Invalided response from update server |
| 20006 | Patch failed |
| 21000 | Invalid alias name |
| 21001 | Rewrite rule not found |
| 21002 | Rewrite rule group not found |
| 21003 | Exceed alias limit |
| 21004 | Rewrite rule domain not found. |
| 22000 | Certificate import failed |
| 22001 | Certificate password exception |
| 22002 | Certificate keystore exception |
| 22003 | Unsupported key |
| 22004 | Unsupported certificate |
| 22005 | Certificate not found |
| 22006 | X509 Certificate not found in PEM object|
| 22007 | Certificate import data is not an valid PEM-encoded object  |
| 22008 | Invalid certificate |
| 22009 | Unsupported certificate algorithm |
| 22010 | Private key not found in PEM object |
| 22011 | Private key import data is not an valid PEM-encoded object |
| 22012 | Invalid private key |
| 22013 | Unable to decrypt private key with supplied password |
| 22014 | Encrypted private key without password |
| 22015 | Unable to verify certificate and private key pair |
| 22016 | Certificate does not match private key |
| 23000 | DoS ip range already exists |
| 23001 | DoS ip range not exists |
| 23002 | Invalid DoS ip range format |
| 23003 | Errors when write mail parser config to disk |
| 24000 | Retrieve domain not found |
| 24001 | Retrieve rule not found |
| 24002 | Invalid retrieve rule |
| 24003 | Invalid data source |
| 24004 | Unable to access domain retrieve rules, dominated by system |
| 24006 | Retrieve rule(s) disabled. |
| 25000 | Email trap domain not exist |
| 26000 | Mass mail prevention configuration not found |
| 27000 | Unable to connect with server by using provided schedule import configuration |
| 27001 | Failed to trigger schedule import |
| 27002 | Another importer of the same schedule-id is running |
| 27003 | Invalid schedule import configuration format |
| 27004 | Schedule execution failed |
| 27005 | Request schedule import operation is not permitted under current function-control scope settings |
| 27006 | Schedule import id not found |
| 28000 | Unsupported export type |
| 28001 | Failed to delete temporary export file |
| 28002 | Not exporter owner |
| 28003 | Exporter not found |

# Search Query
Search indexed messages with provided query and return matched message's
IDs.

You can than use content-related APIs like `messageEnvelope`, `message`,
`header`, `body` to get the part of message you need.

currently index fields are:

> `BLOCK_CAUSE`, `COMMENT`, `SIZE`, `STATUS`, `SMTP_HOSTNAME`, `SMTP_IP`, `SMTP_TIMESTAMP`, `SMTP_FROM`,
> `SMTP_FROM_NONANALYZED`, `SMTP_TO`, `SMTP_TO_NONANALYZED`, `SMTP_TO_COUNT`, `FROM_GROUP`, `FROM_DOMAIN`,
> `TO_GROUP`, `TO_DOMAIN`, `BODY`, `DATE`, `FROM`, `HEADER`, `MESSAGE_ID`, `SUBJECT`, `TO`, `CC`, `BCC`,
> `ATTACHMENT_CONTENT`, `ATTACHMENT_NAME`, `ATTACHMENT_TYPE`, `ATTACHMENT_META_CONTENT`, `PARSE_LIMIT_EXCEEDED`
> `SOURCE_TAG`

following fields are specialized for import:

> `IMPORT_OWNER`, `IMPORT_EXTRACTED_DOMAIN`, `IMPORT_EXTRACTED_DOMAIN_COUNT`, `IMPORT_TO_DOMAIN`, `IMPORT_TO_GROUP`,
> `IMPORT_FROM_DOMAIN`, `IMPORT_FROM_GROUP`, `IMPORT_EXTRACTED_RECIPIENTS`, `IMPORT_EXTRACTED_GROUP`

**To distinguish import and gateway mail, one should add**

* `(NOT _exists_:IMPORT_OWNER)` for gateway part query
* `(_exists_:IMPORT_OWNER)` for import part query

Mail flow directions used in query are defined as follow:

SubjectDomain: current logged-in user's domain id

Gateway case:

* Inbound: `(TO_DOMAIN = SubjectDomain or IMPORT_TO_DOMAIN) and FROM_DOMAIN != SubjectDomain`
* Outbound: `FROM_DOMAIN = SubjectDomain and (TO_DOMAIN != SubjectDomain or IMPORT_TO_DOMAIN)`
* Internal: `FROM_DOMAIN = SubjectDomain and (TO_DOMAIN = SubjectDomain or IMPORT_TO_DOMAIN)`
* External: `FROM_DOMAIN != SubjectDomain and (TO_DOMAIN != SubjectDomain or IMPORT_TO_DOMAIN)`

Import case from domain view:

* Inbound: `(NOT FROM_DOMAIN:<domain> AND IMPORT_EXTRACTED_DOMAIN:<domain>)`
* Outbound: `(FROM_DOMAIN:<domain> AND NOT (IMPORT_EXTRACTED_DOMAIN:<domain> AND IMPORT_EXTRACTED_DOMAIN_COUNT:1))`
* Internal: `(FROM_DOMAIN:<domain> AND IMPORT_EXTRACTED_DOMAIN:<domain>)`
* External: `(NOT FROM_DOMAIN:<domain> AND NOT (IMPORT_EXTRACTED_DOMAIN:<domain> AND IMPORT_EXTRACTED_DOMAIN_COUNT:1))`

Import case from system view:

* Inbound: `(FROM_DOMAIN:<NO_GROUP> AND NOT IMPORT_EXTRACTED_DOMAIN:<NO_GROUP>)`
* Outbound: `(NOT FROM_DOMAIN:<NO_GROUP> AND IMPORT_EXTRACTED_DOMAIN:<NO_GROUP>)`
* Internal: `(NOT FROM_DOMAIN:<NO_GROUP> AND NOT IMPORT_EXTRACTED_DOMAIN:<NO_GROUP>)`
* External: `(FROM_DOMAIN:<NO_GROUP> AND NOT IMPORT_EXTRACTED_DOMAIN:<NO_GROUP>)`

available sort options are:

> `time_asc`, `time_desc`, `size_asc`, `size_desc`

Mail status:

> `Sent`, `Discarded`, `Bounced`, `Quarantined`, `Delayed`, `Imported`

Block cause:

> `ASRC_MATCHED_MALICIOUS`, `ASRC_MATCHED`, `ATTACHMENT_HASH_MALICIOUS`, `ATTACHMENT_HASH`, `BOUNCED`,
> `INVALID_BOUNCED`, `CONTENT_HASH`, `MARKUP_HASH`, `CONTENT_HASH_MALICIOUS`, `MARKUP_HASH_MALICIOUS`,
> `HEADER_RBL`, `INVALID_HEADER`, `KEYWORD_BLACKLIST`, `MALICIOUS_URL`, `PHISHING_URL`, `ASRC_SCAM`, `URIBL`

#### query examples:

sort by size
> `/search?from=0&query=SMTP_TIMESTAMP:[1485964800000 TO *]&size=30&sort=size_desc`

find today's email for user
> `/search?from=0&query=SMTP_TIMESTAMP:[1485964800000 TO *]&size=30&userId=182330579725844480`

find today's mails
> `/search?from=0&query=SMTP_TIMESTAMP:[1485964800000 TO *]&size=30`

find quarantine mails caused by uribl
> `/search?from=0&query=(STATUS:"Quarantined") AND BLOCKCAUSE:"URIBL"&size=30`

find inbox of specified recipient
> `/search?from=0&query=(STATUS:"Sent") AND (TO:"mpuser@mp.com" OR SMTP_TO:"mpuser@mp.com")&size=30`

find spam mails of specified recipient
> `/search?from=0&query=(STATUS:"Quarantined") AND (TO:"mpuser@mp.com" OR SMTP_TO:"mpuser@mp.com")&size=30`

find archived mails of specified recipient

1. GET `/store/archive`
2. `/search?index=1481964800000.1485952900000&from=0&query=(TO:"mpuser@mp.com" OR SMTP_TO:"mpuser@mp.com")&size=30`

find virus mails of specified recipient
> `/search?from=0&query=(STATUS:"Quarantined") AND BLOCKCAUSE:"VIRUS"&size=30`

# Filter Node Configurations
Data type definitions:

#### 1. Filter node
##### mailet node:
```json
{
    "type": "mailet",
    "id": "id",
    "class": "class name",
    "config": "config string"
}
```
##### matcher node:
```json
{
    "type": "matcher",
    "id": "id",
    "class": "class name",
    "config": "config string",
    "match": [
        "mailet/matcher node",
        "..."
    ],
    "mismatch": [
        "mailet/matcher node",
        "..."
    ]
}
```

#### 2. Position
```json
{
    "init": [
        {"index": 5, "leaf": "match"},
        {}//others
    ],
    "tail": 2
}
```

## Currently implemented matchers:

### EmailTrapMatcher

#### Config Formats
```json
{
    "class": "com.sn.mailplatform.antispam.matcher.EmailTrapBuilder",
    "config": {}
}
```

### SmtpAuthSuccessfulMatcher

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.SmtpAuthSuccessfulMatcherBuilder",
    "config": {
        "name": "string"
    }
}
```

* `name`: matcher name, required

### MassMailPreventionMatcher

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.antispam.matcher.MassMailPreventionBuilder",
    "config": {}
}
```

* `enabled`: if false, skip and return as match nothing, default is false

### Nod32Matcher

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.antispam.matcher.NOD32Builder",
    "config": {
        "cliPath":"/opt/eset/esets/bin/esets_cli",
        "timeOutSecs":60,
        "pidPath":"/var/run/esets_daemon.pid"
    }
}
```

* `cliPath`: path to binary executable, optional
* `timeOutSecs`: timeout to wait for anvirus check results, required
* `pidPath`: path to antivirus deamon pid, optional

### MismatchMatcher

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.MismatchMatcherBuilder",
    "config": {
        "name": "string",
        "originalId": "string"
    }
}
```

* `name`: matcher name, required

### StandardMatcher

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.StandardMatcherBuilder",
    "config": {
        "name": "string",
        "conjunction": true,
        "direction": ["inbound", "outbound", "internal", "external"],
        "sender": ["regex strings"],
        "senderGroup": [{"group": "123","includeSubGroup":false}],
        "recipient": ["regex strings"],
        "recipientGroup": [{"group": "345","includeSubGroup":true}],
        "subject": ["regex strings"],
        "header": ["regex strings"],
        "body": ["regex strings"],
        "attachmentName": ["regex strings"],
        "attachmentType": ["regex strings"],
        "attachmentContent": ["regex strings"],
        "attachmentStatus": ["regex strings"],
        "recipientType": "To", //or "Cc", "Bcc", case sensitive
        "ip": "string",
        "size": {
            "upper": 1, // size, int
            "lower": 1 // size, int
        },
        "recipientSize": {
            "upper": 1, // size, int
            "lower": 1 // size, int
        },
        "bccSize": 1, // size, int
        "days":  ["MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"],
        "times": [{"from" : "00:00:00","until" : "23:59:59"}],
        "piiRules": [{"name" : "name","rule" : "rule"}]
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| name | matcher name | string | false | false | default to "" |
| conjunction | condition will be `AND`ed or `OR`ed, default to true (`AND`)  | boolean | false | false |  |
| direction | match mail traffic direction | string | true | false | `inbound`, `outbound`, `internal`, `external`, `other` or `any` only |
| sender | regex match sender address | regex pattern | true | false |  |
| senderGroup | match sender group | groupType | true | false |  |
| senderGroup.groupType.group | group id | string | false | true |  |
| senderGroup.groupType.includeSubGroup | flag to indicate including sub-group or not| boolean | false | true |  |
| recipient | regex match  recipient address | regex pattern | true | false |  |
| recipientGroup | match recipient group | groupType | true | false |  |
| recipientGroup.groupType.group | group id | string | false | true |  |
| recipientGroup.groupType.includeSubGroup | flag to indicate including sub-group or not| boolean | false | true |  |
| subject | regex match  subject | regex pattern | true | false |  |
| header | regex match  header value | regex pattern | true | false |  |
| body | regex match  markup-stripped message body | regex pattern | true | false |  |
| attachmentName | regex match  attachment name | regex pattern | true | false |  |
| attachmentType | regex match  attachment type | regex pattern | true | false |  |
| attachmentContent | regex match  attachment content | regex pattern | true | false |  |
| attachmentStatus | regex match  attachment status | regex pattern | true | false |  |
| recipientType | match recipient type | string | false | false | `To`, `Cc` or `Bcc` only |
| ip | match remote address | string | false | false | strict match |
| size | match message size with size range with unit of bytes | size | false | false | upper/lower are optional int, if missing then it holds |
| size.upper | message size upper bound | integer | false | false | |
| size.lower | message size lower bound | integer | false | false | |
| recipientSize | match recipient counts with counts range | size | false | false | upper/lower are optional int, if missing then it holds |
| recipientSize.upper | recipient count upper bound | integer | false | false | |
| recipientSize.lower | recipient count lower bound | integer | false | false | |
| bccSize | match bcc counts with lower bound | int | false | false |  |
| piiRules | match PII rules evaluation | PII rule | true | false |  |
| piiRules.name | rule name | string | false | true | |
| piiRules.rule | rule expression | string | false | true | |
| days | match current day of week | string | true | false | `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY` or `SUNDAY` only |
| times | match current time of day | interval | true | false | from/until take string of `hh:mm:ss.nnnnnnnn`, `ss.nnnnnnnn` part is optional, valid value from `00:00:00.00000000` to `24:00:00.00000000` |
| times.[].from | match time *inclusive* lower bound | string | false | false | |
| times.[].until | match time *exclusive* upper bound | string | false | false | |

### IsSMIMESigned

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.IsSMIMESignedMatcherBuilder",
    "config": {
        "name": "string"
    }
}
```

* `name`: matcher name, required

### IsSMIMEEncrypted

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.IsSMIMEEncryptedMatcherBuilder",
    "config": {
        "name": "string"
    }
}
```

* `name`: matcher name, required

### AuditResult

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.AuditResultMatcherBuilder",
    "config": {
        "name": "string",
        "result": "string" // one of "delete", "reject", "pass"
    }
}
```

* `name`: matcher name, required


### AdvancedContent

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.AdvancedContentMatcherBuilder",
    "config": {
        "name": "string",
        "conditions": [
            {
                "target": "string", // one of "matcher_Header", "matcher_BodyPlain", "matcher_BodyHtml", "matcher_BodyRaw", "matcher_AttachmentName", "matcher_AttachmentType", "matcher_AttachmentMeta", "matcher_AttachmentContent", "matcher_AttachmentStatus"
                "value": "regex string"
            }
        ],
        "days":  ["MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"],
        "times": [{"from" : "00:00:00","until" : "23:59:59"}]
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| name | matcher name | string | false | false | default to "" |
| days | match current day of week | string | true | false | `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY` or `SUNDAY` only |
| times | match current time of day | interval | true | false | from/until take string of `hh:mm:ss.nnnnnnnn`, `ss.nnnnnnnn` part is optional, valid value from `00:00:00.00000000` to `24:00:00.00000000` |
| times.[].from | match time *inclusive* lower bound | string | false | false | |
| times.[].until | match time *exclusive* upper bound | string | false | false | |
| conditions | RE matching conditions | condition | true | false |  |
| conditions.[].target | RE matching target | string | true | true | `matcher_Header`, `matcher_BodyPlain`, `matcher_BodyHtml`, `matcher_BodyRaw`, `matcher_AttachmentName`, `matcher_AttachmentType`, `matcher_AttachmentMeta`, `matcher_AttachmentContent` or `matcher_AttachmentStatus` only |
| conditions.[].value | RE matching expression | regex | true | true |  |

### WeightingKeywords

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.WeightingKeywordsMatcherBuilder",
    "config": {
        "name": "string",
        "subject": [{
            "value": "regex strings",
            "weight": 1 // int
        }],
        "body": [{
            "value": "regex strings",
            "weight": 1 // int
        }],
        "attachment": [{
            "value": "regex strings",
            "weight": 1 // int
        }],
        "threshold": 1 // size, int
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| name | matcher name | string | false | false | default to "" |
| subject | regex pattern and weight pairs to match subject | keyword | true | false |  |
| subject.[].value | regex pattern | regex | false | true |  |
| subject.[].weight | weight | integer | false | true |  |
| body | regex pattern and weight pairs to match body | keyword | true | false |  |
| body.[].value | regex pattern | regex | false | true |  |
| body.[].weight | weight | integer | false | true |  |
| attachment | regex pattern and weight pairs to match attachment | keyword | true | false |  |
| attachment.[].value | regex pattern | regex | false | true |  |
| attachment.[].weight | weight | integer | false | true |  |
| threshold | summed weight threshold to be considered as matched | integer | false | false | default to 1 |
| times | match current time of day | interval | true | false | from/until take string of `hh:mm:ss.nnnnnnnn`, `ss.nnnnnnnn` part is optional, valid value from `00:00:00.00000000` to `24:00:00.00000000` |
| times.[].from | match time *inclusive* lower bound | string | false | false | |
| times.[].until | match time *exclusive* upper bound | string | false | false | |

### SMIMEVerifySignature

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.SMIMEVerifySignatureMatcherBuilder",
    "config": {
        "name": "string",
        "domain": "string",
        "onlyTrusted": true // boolean
    }
}
```

* `name`: matcher name, required
* `domain`: domain id
* `onlyTrusted`: Usually a message signature to be considered by this mailet as authentic must be valid and trusted.
  Setting this mailet parameter to "false" the last condition is relaxed and
  also "untrusted" signature are considered will be considered as authentic.

### TimeInterval

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.matcher.TimeIntervalMatcherBuilder",
    "config": {
      "name": "string",
      "from": 1, // from epoch in milliseconds
      "until": 1 // from epoch in milliseconds
    }
}
```

* `name`: matcher name, required
* `from`: matching time start point, milliseconds since epoch in UTC, inclusive
* `until`: matching time end point, milliseconds since epoch in UTC, exclusive

## Currently implemented mailets:

### CheckDkim

This mailet is reserved as internal use, should be only configurable
through `Filter` user interface.

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.antispam.mailet.CheckDkimBuilder",
    "config": {
        "failAction": "string" // "quarantine", "discard"
    }
}
```

### SetMimeHeader

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.SetMimeHeaderBuilder",
    "config": {
        "name": "string",
        "value": "string"
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| name | header name to set | string | false | true | *must* be non empty string |
| value | header value to set | string | false | true | *must* be non empty string |

### SetMailAttributes

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.SetMailAttributesBuilder",
    "config": {
        "attributes": {
            "key":"value"
        }
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| attributes | key-value attributes object to set | object with string values only | true | false | |

### AddFooter

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.AddFooterBuilder",
    "config": {
        "text": "string"
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| text | footer text to be added | string | false | false | default to "" |

### Audit

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.AuditBuilder",
    "config": {
        "auditors":      ["string"],
        "condition":     "string", // one of "all", "any", "custom"
        "defaultAction": "string", // one of "wait", "pass", "reject", "delete"
        "cause":         "string",
        "deadline":      1 // long
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| auditors | auditor email address | email address | true | true |  |
| condition | condition to release audited email, `all` means only act after all auditor reported and mail will pass only if all auditor accept it. `any` means mail will pass if any auditor accept it. default to `any` | string | false | false | `all`, `any` or `custom` only |
| defaultAction | action when deadline reached | string | false | false | `wait`, `pass`, `reject` or `delete` only |
| cause | reason for this audit, default to `unknown` | string | false | false |  |
| deadline | deadline for this audit, take milliseconds from epoch as deadline | integer | false | false |  |

### Bounce

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.BounceBuilder",
    "config": {
        "message": "string",
        "subjectPrefix": "string",
        "attachmentType": "string",
        "sender": "string"
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| passThrough | whether let processing mail continue its process chain | boolean | false | false | default to `true` |
| inlineType | how to inline original message to new message | string | false | false | one of `unaltered`, `heads`, `body`, `all` or `none`, default to `none` |
| attachmentType | how to attach original message as attachment | string | false | false | one of ``, `heads`, `body`, `all`, `none` or `message`, default to `message` |
| message | notice message for new message | string | false | false | default to "We were unable to deliver the attached message because of an error in the mail server." |
| sender | the value `From` header will be set | string | false | true | mail address or one of `postmaster`, `sender` or `unaltered` |
| subjectPrefix | optional subject prefix prepended to the original message's subject | string | false | false | default to `Re:` |
| attachError | whether to attach error message if any | boolean | false | false | default to `false` |

* `inline`:
  * `unaltered`: The original message is the new message.
  * `heads`: The headers of the original message are appended to the message
  * `body`: The body of the original is appended to the new message
  * `all`: Both headers and body are appended
  * `none`: Neither body nor headers are appended
* `attachment`: One of the following items:
  * `heads`: The headers of the original are attached as text
  * `body`: The body of the original is attached as text
  * `all`: Both headers and body are attached as a single text file
  * `none`: Nothing is attached
  * `message`: The original message is attached as type message/rfc822, this means that it can, in many cases, be opened, resent, fw'd, replied to etc by email client software
* `sender`:
  * mail address: `From` header will be set to given address
  * `sender`: `From` header will not be modified
  * `unaltered`: same as `sender`
  * `postmaster`: `From` header will be set to postmaster.

### CancellableDelayedDelivery

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.CancellableDelayedDeliveryBuilder",
    "config": {
        "isNotify": true, // boolean
        "cause":    "string",
        "subject":  "string",
        "content":  "string",
        "deadline": 1 // long
    }
}
```

this is an altered form of audit action with default action set with
"pass".

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| isNotify | whether send notification | boolean | false | false | default to `true` |
| cause | reason for this action | string | false | false | default to "unknown" |
| subject | notification subject | string | false | false | default to `[Mail Confirm Notice] [subject]` |
| content | notification message | string | false | false | default to `This mail is waiting for confirm due to: [cause]` |
| deadline | delay duration, mail will be sent after passed `current time + deadline (in milli)` | integer | false | false | default to 1 hour (in millisecond) |

### DelayedDelivery

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.DelayedDeliveryBuilder",
    "config": {
        "delay": 1 // long
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| delay | Delay in milliseconds | integer | false | false | default is no delay (= value set to -1) |

### Discard

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.DiscardBuilder",
    "config": {
    }
}
```

### EncryptMailWithZip

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.EncryptMailWithZipBuilder",
    "config": {
        "notifyNone": false,
        "notifySender": false,
        "notifyTarget": ["example1@example.com", "example2@example.com"],
        "dynamicPassword": false,
        "password": "password string",
        "notifyMessage": "string"
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| notifyNone | whether send notification to no one | boolean | false | false | You have to choose one and only one of `notifyNone`, `notifySender` and `notifyTarget` to be `true` or non empty array, choosing none or more than one will cause an error. |
| notifySender | whether send notification to sender | boolean | false | false |  |
| notifyTarget | mail addresses send notification to | mail address | true | false |  |
| dynamicPassword | whether use dynamic password | boolean | false | false | one of `dynamicPassword` and `password` has to be `true` or non empty string, choosing none or both will cause an error. |
| password | static password | string | false | false |  |
| notifyMessage | notify message | string | false | false |  |

### Forward

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.ForwardBuilder",
    "config": {
        "forwardTo": ["string"]
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| passThrough | whether let processing mail continue its process chain | boolean | false | false | default to `true` |
| forwardTo | forwarding destinations | string | true | true | mail address or one of `sender`, `reverse.path`, `from`, `reply.to`, `to`, `recipients`, `postmaster`, `unaltered` or `null` |

* `forwardTo`:
  * mail address: value as address
  * `sender`: SMTP `MAIL FROM` value
  * `reverse.path`: same as `sender`
  * `from`: same as `sender`
  * `reply.to`: `Reply-To` header value or SMTP `MAIL FROM` value if there is no `Reply-To` header
  * `to`: SMTP `RCPT TO` value
  * `recipients`: same as `recipients`
  * `postmaster`: postmaster
  * `unaltered`: if `forwardTo` has only `unaltered`, the forwarded mail will use the same recipients as original mail, otherwise this value will not represent any address.
  * `null`: nothing

### NotifyWithMessage

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.NotifyWithMessageBuilder",
    "config": {
        "notifyRecipients": false,
        "notifySender": false,
        "notifyTarget": ["example1@example.com", "example2@example.com"],
        "bccNone": false,
        "bccSender": false,
        "bccTarget": ["example1@example.com", "example2@example.com"],
        "subject": "string",
        "message": "string",
        "useHtml": true // boolean
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| notifyRecipients | whether send notification to recipients | boolean | false | false | You have to choose one and only one of `notifyRecipients`, `notifySender` and `notifyTarget` to be true or non empty array, choosing none or more than one will cause an error. |
| notifySender | whether send notification to sender | boolean | false | false |  |
| notifyTarget | mail addresses send notification to | mail address | true | false |  |
| bccRecipients | whether send BCC notification to recipients | boolean | false | false | You may choose one and only one of `bccRecipients`, `bccSender` and `bccTarget` to be true or non empty array, or you may choose none of them. |
| bccSender | whether send BCC notification to sender | boolean | false | false |  |
| bccTarget | mail addresses send BCC notification to | mail address | true | false |  |
| subject | notification subject | string | false | false | default to "(No Subject)" |
| message | notification message | string | false | false | |
| useHtml | whether send notification message as HTML | boolean | false | false | default to `true` |

### IncapacitateHyperlink

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.IncapacitateHyperlinkBuilder",
    "config": {
    }
}
```

### SMIMESign

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.SMIMESignBuilder",
    "config": {
        "keyAlias": "string",
        "keyAliasPassword": "string",
        "domain": "string",
        "signerName": "string",
        "rebuildFrom": true, //boolean
        "encrypt": true, // boolean
        "rcptKeyAlias": "string",
        "encryptedSubject": "string",
        "explanationText": "string"
    }
}
```

* `keyAlias`: email address of sender used as key alias to retrieve sender's private key from keystore, required
* `keyAliasPassword`: password to access sender's key from keystore, required
* `domain`: domain id, required
* `signerName`: signer name use for create signature, optional
* `rebuildFrom`: If true will modify the "From:" header. default=true
The modification is as follows: assuming that the signer mail address in
the signer certificate is trusted-server@xxx.com> and that From: "John
Smith" we will get From: "John Smith" " <trusted-server@xxx.com>.
* `encrypt`: If true will encrypt this email, default=true
* `rcptKeyAlias`: recipient email address used as key alias to retrieve recipient's public key from keystore, optional
* `encryptedSubject`: if true will used as the subject of encrypted mail, optional
* `explanationText`: the text of an explanation of the meaning of this server-side signature, optional

May contain the following substitution patterns: [signerName],
[signerAddress], [reversePath], [headers].

### SMIMEDecrypt

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.SMIMEDecryptBuilder",
    "config": {
        "domain": "string"
    }
}
```

* `domain`: domain id, required

### ToGateway

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.ToGatewayBuilder",
    "config": {
        "gateways": ["10.0.0.0", "example.smail.com"]
    }
}
```

| name | desc | type | multiple value | required | other comment |
|----------------|------|------|----------------|----------|------------------|
| gateways | host address | string | true | true | ip or domain name |

### UserQuarantine

#### Config Formats

```json
{
    "class": "com.sn.mailplatform.mailet.UserQuarantineBuilder",
    "config": {
        "cause": "string",
        "deadline": 1 // long
    }
}
```

this is an altered form of audit action with default action set with
"delete" and auditor set with recipient.

* `cause`: reason for quarantine, optional
* `deadline`: time limit before mail deleted, user can release this mail through audit function, optional

# Preference Reserved Keywords
## account-last-login
```json
{
  "last_login": 123
}
```

## account-password-history

```json
{
  "password_failed_count": 123,
  "password_age_day": 456
}
```

## account-misc

```json
{
  "language": "en",
  "view_mode": "one of 0 (basic), 1 (detail)",
  "start_page": "one of 0 (mailBox), 1 (preference)",
  "time_zone": "zoneId (e.g. Asia/Taipei)",
  "theme": "default",
  "logged_out_secs": 9000
}
```

## account-mail-read

```json
{
  "layout": "one of 0 (horizontal), 1 (vertical), 2 (fullpage)",
  "auto_preview": true,
  "strip_javascript": true,
  "default_message_format": "one of 0 (html), 1 (plain)",
  "block_external_picture": "one of 0 (all), 1 (trusted), 2 (none)",
  "num_per_page": "one of 20, 50, 100, 200, 500, 1000",
  "pos_after_delete": "one of 0 (next), 1 (prev), 2 (first)",
  "auto_fetch": true,
  "clean_recycle": "one of 0 (all), -1 (none), int_size",
  "mail_notify": "one of 0 (now), 1 (schedule)"
}
```

## account-mail-write

```json
{
  "editor_layout": "one of 0 (500X300), 1 (750X450), 2 (1000X600)",
  "message_format": "one of 0 (html), 1 (plain)",
  "backup_sent": true,
  "delete_draft": true,
  "reply_format": "one of 0 (withOriginal), 1 (withPrefixedOriginal), 2 (normal)",
  "prefix_symbol": ">",
  "use_vcard": true,
  "eml_to_body": true
}
```

## antispam-config

```json
{
  "content_hash" : {
    "combine_subject" : true,
    "content_rbl_server" : [
      {
        "host" : "f.softsqr.com",
        "enabled" : true
      }
    ],
    "markup_rbl_server" : [
      {
        "host" : "b.softsqr.com",
        "enabled" : true
      }
    ]
  },
  "attachment_hash" : {
    "hash_rbl_server" : [
      {
        "host" : "a.softsqr.com",
        "enabled" : true
      }
    ]
  },
  "bounced_spam" : {
    "size_upper_bound" : 10240
  },
  "uri_rbl" : {
    "max_lookup" : 3,
    "uri_rbl_server" : [
      {
        "host" : "multi.surbl.org",
        "enabled" : true
      },
      {
        "host" : "multi.uribl.com",
        "enabled" : true
      }
    ]
  },
  "header_rbl" : {
    "check_private" : false,
    "rbl_server" : [
      {
        "host" : "bl.spamcop.net",
        "enabled" : true
      },
      {
        "host" : "cbl.abuseat.org",
        "enabled" : true
      },
      {
        "host" : "pbl.spamhaus.org",
        "enabled" : true
      }
    ]
  },
  "spamWeight": {
    "attachment": 100,
    "contentHash": 100,
    "markupHash": 100,
    "uribl": 100,
    "asrc": 100,
    "headerRbl": 100,
    "invalidHeader": 100,
    "spam_url": 100,
    "keyword_blacklist": 100,
    "threshold": 100
  },
  "threat_weight" : {
    "attachment" : 100,
    "content_hash" : 100,
    "markup_hash" : 100,
    "bounce" : 100,
    "asrc" : 100,
    "asrc_social" : 100,
    "advanced_defense" : 100,
    "malicious_url" : 100,
    "threshold" : 100
  }
}
```
## antispam-switch

```json
{
  "content_and_markup_hash": true,
  "attachment_hash": true,
  "header_rbl": true,
  "uri_bl": true,
  "asrc_pattern": true,
  "invalid_header": true,
  "spam_url": true,
  "keyword_blacklist": true,
  "white_list_override_black_list": false
}
```
## quarantine-notice

```json
{
  "customized": true,
  "login_settings": {
    "display_login_hyperlink": false,
    "url_type": "one of hostname, ipaddress or string",
    "use_https": true,
    "display_qr_code": true
  },
  "mail_format": {
    "with_mime_html": true,
    "with_plaintext": false,
    "with_attachment": false
  },
  "schedule": [
    {
    "weekday": [1, 7], //  (Sunday) to (Saturday)
    "hour": 0,
    "minute": 0,
    "time_zone": "Etc/UTC"
    }
  ]
}
```
## threat-switch

```json
{
  "asrc_pattern": true,
  "attachment_hash": true,
  "content_and_markup_hash": true,
  "social_engineering": true,
  "advanced_defense_module": true,
  "malicious_url": true,
  "bounced_spam": true
}
```
## login

```json
{
  "allowed_from_ip": [
    "192.168.1.1"
  ],
  "login_failed_threshold": 3,
  "login_failed_notify_email": "adm@d1.mp.com",
  "display_domain_dropdowns": false
}
```
## system-update

```json
{
  "auto_update_system": false,
  "auto_update_pattern": false,
  "proxy": {
    "scheme": "http or https",
    "host": "proxy.com",
    "port": "8080",
    "username": "optional_proxy_username",
    "password": "optional_proxy_password"
  }
}
```
## domain-source-tag

```json
{
  "tags": ["1129"]
}
```
## system-source-tag

```json
{
  "tags": ["s1129"]
}
```
## system-misc

```json
{
  "language": "en",
  "expire_settings": {
    "expire_mail": true,
    "expire_log_days": 365,
    "expire_normal_days": 365,
    "expire_spam_days": 14,
    "expire_threat_days": 14,
    "expire_virus_days": 7,
    "expire_bounced_days": 7,
    "expire_discarded_days": 7,
    "minimum_free_space_gb": 30,
    "logo_url": ""
  }
}
```
## system-notification

```json
{
  "email": "notification@mp.com",
  "name": "notification",
  "bcc_prefix": "[BCC] ",
  "url_host": "hostname",
  "use_https": false,
  "resend_time_hour": 1
}
```
## antivirus-update-esets

```json
{
    "schedule": {
        "interval": "one of monthly, weekly, daily, hourly, never",
        "date": 1, // 1 to 31
        "weekday": 1, // 1 (Sunday) to 7 (Saturday)
        "hour": 0 //0 to 23
    }
}
```
## password-principle

```json
{
  "force_update_at_first_login": true,
  "history": "one of 1, 5, 30, 60, 120, 0 (unlimit)",
  "deadline": "one of 0 (unlimit), int_size",
  "reset_deadline": true,
  "min_length": "int_size",
  "max_length": "int_size",
  "complexity": [
    1,
    2,
    3,
    4,
    5
  ]
}
```
## mail-pattern

```json
{
  "patterns":
    [
      {
        "name": "rule_1",
        "rule": "token_1 > 5 and token_2 >= 3",
        "enabled": true
      }
    ]
}
```
## schedule-imap-pop3-import

```json
{
  "schedule": [
    {
      "id": "91083511-083a-44af-82e8-75f59719136f",
      "node_id": "n1",
      "enabled": true,
      "config": {
          "use_pop3": false,
          "server_address": "1.1.1.1",
          "server_port": 143,
          "use_ssl": false,
          "account": "user",
          "password": "123",
          "start_hour": 3,
          "start_minute": 10,
          "end_hour": 4,
          "end_minute": 0,
          "receiving_limits": 1000,
          "delete_after_received": true
        }
    }
  ]
}
```

## system-ui-template

```json
  "templates": [
    {
      "id": "4194308",
      "l1_menus": [
        "system",
        "domain",
        "account",
        "group",
        "mail",
        "filter",
        "threat",
        "archive"
      ],
      "l2_menus": [
        "/app/system/infrastructure",
        "/app/system/archiving",
        "/app/system/settings",
        "/app/system/logs",
        "/app/system/services",
        "/app/system/systemInfo",
        "/app/system/licenseInfo",
        "/app/system/update",
        "/app/system/filterLocks",
        "/app/system/indexError",
        "/app/domain/domains",
        "/app/domain/aliases",
        "/app/account/accounts",
        "/app/account/create",
        "/app/account/principle",
        "/app/account/admin",
        "/app/account/auth",
        "/app/account/sync",
        "/app/group/management",
        "/app/mail/filtertree",
        "/app/mail/search",
        "/app/filter/connection",
        "/app/filter/feature",
        "/app/filter/trapMail",
        "/app/filter/intercept",
        "/app/filter/personalDataFeature",
        "/app/threat/antivirus",
        "/app/threat/antithreat",
        "/app/threat/dos",
        "/app/threat/emailAbuse",
        "/app/archive/routine",
        "/app/archive/record"
      ]
    },
    {
      "id": "4194311",
      "l1_menus": [
        "system",
        "account",
        "group",
        "mail",
        "filter",
        "threat",
        "archive"
      ],
      "l2_menus": [
        "/app/system/infrastructure",
        "/app/system/archiving",
        "/app/system/settings",
        "/app/account/accounts",
        "/app/account/privacy",
        "/app/account/create",
        "/app/account/principle",
        "/app/account/auth",
        "/app/account/sync",
        "/app/group/management",
        "/app/mail/filtertree",
        "/app/mail/search",
        "/app/filter/feature",
        "/app/filter/trapMail",
        "/app/filter/intercept",
        "/app/filter/ruleGroup",
        "/app/filter/personalDataFeature",
        "/app/threat/antithreat",
        "/app/threat/emailAbuse",
        "/app/threat/passStrength",
        "/app/archive/routine",
        "/app/archive/record"
      ]
    },
    {
      "id": "4194312",
      "l1_menus": [
        "group",
        "mail"
      ],
      "l2_menus": [
        "/app/group/management",
        "/app/mail/filtertree",
        "/app/mail/search"
      ]
    }
  ]
```
