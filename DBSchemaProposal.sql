------
USER 
------
id 					numbeic
userName			String
firstName			String
lastName			String
dateOfBirth			Date
email				String
password			password


------
POST
------
id					numeric
title				string
details				blob
createdOn			Date
updatedOn			Date
type				String

----------------
POST_REACTION
----------------
id							numeric
post_id						numeric FK (post table)
reacted_by/user_id			numeric FK (user table)
type						String (types are LIKE, DISLIKE, COMMENT)
comment						String (blob) (it will have value if reaction type is comment)


----------------
User_Posts
----------------
id					numeric
user_id				numeric   FK  (user table)
post_id				numeric	  FK   (post table)