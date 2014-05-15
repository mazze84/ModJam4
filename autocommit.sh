#!/bin/bash
# Auto Commit Script Created for ModJam 4
while true; do
CDATE=`date`
CHOST=`hostname`
 
COMMITMESSAGE="Auto Commit - ${CDATE} (${CHOST})"
 
echo "==== Starting Commit with message: ${COMMITMESSAGE}"
 
git pull origin master
 
# Add all code
git add -A
 
# Commit
git commit -m "$COMMITMESSAGE" --allow-empty # (Allow empty will push an empty commit)
 
# Push
git push --set-upstream origin master
 
echo "==== Auto Commit completed"
sleep 900
done