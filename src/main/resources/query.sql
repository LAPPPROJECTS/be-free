INSERT INTO messages(id, to_user, from_user, body)
VALUES(UUID_TO_BIN(UUID()), 101, 202, 'Hey. How are you?'),
      (UUID_TO_BIN(UUID()), 202, 101, 'Great. Project almost done')  ;


SELECT
BIN_TO_UUID(id) id,
to_user,
from_user,
body
FROM messages;

SELECT
BIN_TO_UUID(id) id,
body
FROM messages;

SELECT
BIN_TO_UUID(id) id,
from_user,
body
FROM messages;

SELECT
from_user,
body
FROM messages
WHERE to_user = 202;

SELECT
to_user,
body
FROM messages
WHERE from_user = 111;

DELETE
FROM messages
WHERE from_user = 101;



