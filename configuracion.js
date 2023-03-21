import firebase from "firebase/app";
import "firebase/firestore";

// TODO: Replace the following with your app's Firebase project configuration
// See: https://support.google.com/firebase/answer/7015592
const firebaseConfig = {
  apiKey: "AIzaSyC6PD7umB1l1fSaWr6kmDRRY6t8I2HRFxY",
  authDomain: "dulce-antojo-b2c22.firebaseapp.com",
  projectId: "dulce-antojo-b2c22",
  storageBucket: "dulce-antojo-b2c22.appspot.com",
  messagingSenderId: "7372812692",
  appId: "1:7372812692:web:544f19a86adde5506c1f81",
  measurementId: "G-RSLT1TE1LG"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);


// Initialize Cloud Firestore and get a reference to the service
const db = firebase.firestore();
