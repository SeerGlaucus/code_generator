#!/bin/bash
app='/home/server/union-base-generator-2.0.6.RELEASE.jar'
args='-Dspring.profiles.active=prod'
log='/home/logs/gxqps-web/startup.log'
cmd=$1
pid=`ps -ef|grep java|grep $app|awk '{print $2}'`

startup(){
  nohup java -jar $args $app >$log 2>&1 &
  for (( i=0; i<24; ++i ))
  do
    if [ $(curl -sIL -w "%{http_code}" -o /dev/null http://127.0.0.1:84/login) -eq 200 ];then
      echo "server start success!"
      break
    else
      if [[ i -eq 23 ]];then
        echo "start 2min timeout, server start fail!"
        exit 1
      else
        echo "server start..."
        sleep 5
      fi
    fi
  done
}

if [ ! $cmd ]; then
  echo "Please specify args 'start|restart|stop'"
  exit
fi

if [ $cmd == 'start' ]; then
  if [ ! $pid ]; then
    startup
  else
    echo "$app is running! pid=$pid"
  fi
fi

if [ $cmd == 'restart' ]; then
  if [ $pid ]
    then
      echo "$pid will be killed after 3 seconds!"
      sleep 3
      kill -9 $pid
  fi
  startup
fi

if [ $cmd == 'stop' ]; then
  if [ $pid ]; then
    echo "$pid will be killed after 3 seconds!"
    sleep 3
    kill -9 $pid
  fi
  echo "$app is stopped"
fi


