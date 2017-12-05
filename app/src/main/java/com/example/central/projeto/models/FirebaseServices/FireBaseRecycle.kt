package com.example.central.projeto.models.FirebaseServices

import com.example.central.projeto.Beans.Informacoes
import com.google.firebase.database.*

/**
 * Created by Central on 04/12/2017.
 */

class FirebaseHelper(internal var db: DatabaseReference) {

    internal var Complaints = ArrayList<Informacoes>()

    // Puxa Dados
    fun retrieve(): ArrayList<Informacoes> {

        db.addChildEventListener(object : ChildEventListener {

            override fun onChildAdded(dataSnapshot: DataSnapshot, s: String?) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(Informacoes::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
//muda dados
            override fun onChildChanged(dataSnapshot: DataSnapshot, s: String?) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(Informacoes::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
//remove dados
            override fun onChildRemoved(dataSnapshot: DataSnapshot) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(Informacoes::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
            override fun onChildMoved(dataSnapshot: DataSnapshot, s: String?) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(Informacoes::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {}
        })

        return Complaints
    }



}
