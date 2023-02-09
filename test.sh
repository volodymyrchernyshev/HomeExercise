#!/bin/bash


curl --location --request POST 'localhost:8080/calculateBonus' \
--header 'Content-Type: application/json' \
--data-raw '{"transactionAmountDollars":120}'