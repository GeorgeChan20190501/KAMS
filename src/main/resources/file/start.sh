#!/bin/bash
echo  ".........KAMS start ............."

nohup java -jar  KAMS.jar  --spring.profiles.active=prod >/dev/null 2>&1&

echo  ".........KAMS start success............."
 
